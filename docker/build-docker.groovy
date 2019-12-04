def call(){
  stage "Building Docker Image", {
    node{
      unstash "workspace"

      println "docker: execute: login_to_registry()"
      sh "docker rmi centos 2> /dev/null"
      }
  }
}
