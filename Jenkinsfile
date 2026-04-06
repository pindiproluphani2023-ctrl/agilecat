pipeline {
  agent any

  environment {
    IMAGE_NAME = "multiplication-app"
    IMAGE_TAG  = "1.0"
  }

  stages {
    stage('Checkout') {
      steps {
        checkout scm
      }
    }

    stage('Build') {
      steps {
        dir('MULTIPLICATION-APP') {
          bat 'mvn -B -DskipTests clean package'
        }
      }
    }

    stage('Test') {
      steps {
        dir('MULTIPLICATION-APP') {
          bat 'mvn -B test'
        }
      }
      post {
        always {
          dir('MULTIPLICATION-APP') {
            junit 'target/surefire-reports/*.xml'
          }
        }
      }
    }

    stage('Docker Build') {
      steps {
        dir('MULTIPLICATION-APP') {
          bat 'docker version'
          bat "docker build -t %IMAGE_NAME%:%IMAGE_TAG% ."
        }
      }
    }
  }
}
