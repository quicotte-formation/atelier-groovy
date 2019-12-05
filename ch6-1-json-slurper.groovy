import groovy.json.JsonSlurper

// JSON vers objet
File f = new File('pays.json')
InputStream fis = f.newInputStream()
def slurper = new JsonSlurper()
def objet = slurper.parse( fis )
print objet