void call(){

        stage "Example code analysis" {
                node{
      unstash "workspace"

      println "docker: execute: login_to_registry()"
      sh "docker run -td centos 2> /dev/null"
      }
    }
}

 

