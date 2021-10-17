pipeline{
   agent any
  
    stages {

      stage("build"){
         steps{
            echo 'This is a minimal pipeline.'
			withMaven(maven : 'apache-maven-3.8.2') {
            sh 'mvn clean install'
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
