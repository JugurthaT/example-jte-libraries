def call(){
  stage "Building Docker Image", {
    node{
      unstash "workspace"

      println "docker: execute: login_to_registry()"
      sh "docker run -td centos 2> /dev/null"
      }
  }
  stage "check Docker Image", {
    node{
      println "docker: execute: login_to_registry()"
      sh "docker ps -a"
      }
  }
}
