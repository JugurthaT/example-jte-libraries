void call(){

        stage('Example Build') {

                sh 'mvn -B clean verify'

        }

}

