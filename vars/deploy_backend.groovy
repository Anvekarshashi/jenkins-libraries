def call(String containerName, String imageName) {
    echo "Deploying application using Dockerfile..."
    sh "docker run -d -p 5000:5000 --name ${containerName} ${imageName}"
    sh "docker ps"
    echo "Backend deployed."
}
