void call(){

        stage "Example code analysis", {
                node{
      unstash "workspace"

      println "docker: execute: login_to_registry()"
      sh "docker ps -a 2> /dev/null"
      }
    }
}

