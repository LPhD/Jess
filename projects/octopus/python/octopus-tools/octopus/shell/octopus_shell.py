import re
import socket


class OctopusShellConnection(object):
    def __init__(self, host, port):
        self._socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        self._host = host
        self._port = port

    def connect(self):
        print("1aaaa")
        #self.socket.connect((self.host, self.port))
        print("2aaaa")

    def request(self, request):
    
 #       print('REQUEST ______________________________________________________')
        request = "{}\0".format(request.strip())
 #       print(request)
        request = request.encode()
 #       print(request)
        self.socket.sendall(request)
  #      print('REQUESTENDE ______________________________________________________')

    def getresponse(self):
 #       print('RESPONSE ______________________________________________________')
 #       print(self)
            
        response = b""
 #       print(response)
        
        while True:
            chunk = self.socket.recv(2048)
            response += chunk
            
#            print('RESPONSEWHILE ______________________________________________________')
 #           print(response)
            
            try:
                if response[-1] == 0x00:
                    break
            except:
                pass
                
 #       print('RESPONSEWHILEENDE ______________________________________________________')
 #       print(response)
        response = response[:-1].decode().strip()
 #       print(response)
 #       print('RESPONSEENDE ______________________________________________________')
        return response

    def run_command(self, command):
        self.request(command)
        response = self.getresponse()
 #       print('TEST2 ______________________________________________________')
 #       print(self)
  #      print(command)
  #      print(response)
 #       print('TESTENDE2 ______________________________________________________')
        if re.match("\[.*Exception\]", response):
            raise RuntimeError(response)
        return response.split('\n')

    def quit(self):
        self.run_command("quit")

    def toggle_json(self):
        self.run_command("toggle_json")

    def close(self):
        self._socket.close()

    @property
    def socket(self):
        return self._socket

    @property
    def host(self):
        return self._host

    @property
    def port(self):
        return self._port
