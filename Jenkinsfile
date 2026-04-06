pipeline {
  agent any

  environment {
    APP_DIR = "MULTIPLICATION-APP"
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
        dir(APP_DIR) {
          bat 'mvn -B -DskipTests clean package'
        }
      }
    }

    stage('Test') {
      steps {
        dir(APP_DIR) {
          bat 'mvn -B test'
        }
      }
      post {
        always {
          dir(APP_DIR) {
            junit 'target/surefire-reports/*.xml'
          }
        }
      }
    }

    stage('Docker Build') {
      steps {
        dir(APP_DIR) {
          bat 'docker version'
          bat "docker build -t %IMAGE_NAME%:%IMAGE_TAG% ."
        }
      }
    }
  }
}
