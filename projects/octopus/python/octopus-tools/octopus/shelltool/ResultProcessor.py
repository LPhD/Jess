#!/usr/bin/env python3
import sys

class BaseResultProcessor:
    def __init__(self, result):
        self.result = result
        #Property labels on edges
        if 'properties' not in result:
            props = {}
            for k, v in result.items():
                 props[k] = [{'value': result[k], 'id': v}]
            self.result['properties'] = props
    @staticmethod
    def value(element,key):
        prop = element['properties'].get(key,[])
        if len(prop) == 0:
            return None
        return prop[0]['value']
    @staticmethod
    def id(element):
        return element['id']
    def properties(self):
        return self.result


class NodeResultPropertyCleaner(BaseResultProcessor):
    def properties(self):
        pd = {}
        for k,v in self.result['properties'].items():
            l = [ x['value'] for x in v ]
            if len(l)==1:
                pd[k] = l[0]
            else:
                pd[k] = l
        return pd

