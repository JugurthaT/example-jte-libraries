void call(){

        stage('Example Build') {
            steps {
                sh 'mvn -B clean verify'
            }
        }

}

