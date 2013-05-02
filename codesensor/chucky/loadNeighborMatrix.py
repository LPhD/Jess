
import sys
from NameToDictMap import NameToDictMap
from OccurrenceCounter import OccurrenceCounter
from termDocMatrix.NameDictMapToMatrix import NameDictMapToMatrix
from distanceMatrix.dataMatrixToDistMatrix import DataMatrixToDistMatrix

# Convert output generated by 
# func2APISymbols.groovy to term document
# matrix and distance matrix for neighborhood
# discovery

m = NameToDictMap()
allSymbols = OccurrenceCounter()

f = file(sys.argv[1])
for line in f.readlines():
    if line.startswith('/NEWFUNC'):
        funcId = line.split(' ')[-1]
    else:
        (code, n) = line.split('\t')
        m.add(code, funcId, int(n))
        allSymbols.add(code)


converter = NameDictMapToMatrix()
converter.convertFromDicts(m, allSymbols)
converter.termDocumentMatrix.tfidf()

converter2 = DataMatrixToDistMatrix('')
converter2.convert(converter.termDocumentMatrix.matrix, 'cosine')
converter2.save('cosine')