pipeline{
   agent any
  
    stages {

      stage("build"){
         steps{
            echo 'This is a minimal pipeline.'
			withMaven(jdk: 'jdk1.8', maven: 'apache-maven-3.8.2') {
            sh 'ls -l'
			}
         }
      }

      stage("test"){
         steps{
              echo 'testing the app..'
         }
      }

      stage("deploy"){
         steps{
              echo 'deploying the app..'
         }
      }
   }
}
