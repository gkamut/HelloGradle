pipeline {
    agent { docker { image 'openjdk:latest' } }
    stages {
        stage('build') {
            steps {
                sh 'gradlew build'
            }
        }
    }
}