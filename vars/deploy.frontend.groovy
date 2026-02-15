def call(String containerName, String imageName) {
    echo "Deploying application using Dockerfile..."
    sh "docker run -d -p 3000:3000 --name frontend anvekarshashi/frontend "
    sh "docker ps"
      echo "Frontend deployed."
