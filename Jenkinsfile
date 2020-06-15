pipeline {
  agent { node { label 'slave01' } }

   stages {
      stage('Clone Sources') {
        steps {
          checkout scm
        } 
      }
     stage('Selected language') {
         steps {
            echo "You choose to code in ${Language}"
         }
      }
      
	  stage('Python') {
       when { expression {return params.Language == 'Python' || params.Language == 'All' }
	   }
	   steps {
            echo 'python code'
        }
		 
         }
      
      stage('C') {
         steps {
            echo 'C code'
         }
      }
      stage('Bash') {
         steps {
            echo 'Bash code'
         }
      }
      stage('Java') {
         steps {
            echo 'Java code'
         }
      }
      stage('C#') {
         steps {
            echo 'C# code'
         }
      }
      
   }

}
