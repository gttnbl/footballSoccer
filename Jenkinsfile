pipeline{
   agent any
   tools { 
        maven 'apache-maven-3.0.1'
        jdk 'jdk8' 
    }
    stages {
	stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                ''' 
            }
        }
      stage("build"){
         steps{
            echo 'This is a minimal pipeline.'
			
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
