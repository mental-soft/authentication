pipeline {
  agent any
  stages {
    stage('Build and Test') {
      steps {
        sh './gradlew build'
      }
    }
    stage('') {
      steps {
        parallel(
          "dee": {
            echo 'deploy qa'
            echo 'abc'
            
          },
          "dee1": {
            echo 'dee11'
            
          }
        )
      }
    }
    stage('arcc') {
      steps {
        archiveArtifacts '**.jar'
        cleanWs(deleteDirs: true)
      }
    }
  }
  environment {
    abc = 'qa'
  }
}