import groovy.json.JsonSlurper

// JSON vers objet
URL url = new URL('https://postman-echo.com/get')
url.openConnection()
InputStream fis = f.newInputStream()
def slurper = new JsonSlurper()
def objet = slurper.parse( fis )
print objet