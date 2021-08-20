import json
import pprint
import urllib.request

pp = pprint.PrettyPrinter(indent=2);
with urllib.request.urlopen('http://numbersapi.com/1/date?json') as resp:
    pp.pprint(json.loads(resp.read()))

