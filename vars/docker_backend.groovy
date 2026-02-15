def call(String ProjectName, String ImgaeTag, String DockerHubUser) {
   echo "Building backend Docker images..."
  sh "docker build -t anvekarshashi/backend:latest ."
  echo "Docker backend image built."
}
