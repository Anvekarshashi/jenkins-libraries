def call(String ProjectName, String ImgaeTag, String DockerHubUser) {
  sh "docker build -t anvekarshashi/backend:latest ."
}
