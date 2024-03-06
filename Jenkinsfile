pipeline {
    agent any
    environment {
        JAVA_HOME_8 = 'C:\\Data\\Java\\openlogic-openjdk-8u382-b05-windows-64'
        JAVA_HOME_21 = 'C:\\Data\\Java\\jdk-21.0.2'
    }

    stages {
        stage('Test with Java 8') {
            steps {
                script {
                    env.PATH = "${env.JAVA_HOME_8}\\bin;${env.PATH}"
                }
                bat 'java -version'
                bat 'gradle clean test'
            }
        }

        stage('Test with Java 21') {
            steps {
                script {
                    env.PATH = "${env.JAVA_HOME_21}\\bin;${env.PATH}"
                }
                bat 'java -version'
                bat 'gradle clean test'
            }
        }
    }
}
