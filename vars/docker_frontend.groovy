def call(String ProjectName, String ImgaeTag, String DockerHubUser) {
    echo "Building fontend Docker images..."
  sh "docker build -t anvekarshashi/frontend:latest ."
   echo "Docker frontend image built."
}
