void call(){
  println "Jug :maven: build()"
  node {
    any
  }
  tool {
        maven 'apache-maven-3.0.1' 
    }
}
