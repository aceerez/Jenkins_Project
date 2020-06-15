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
	  
	   stage('Build') {
		   steps {
			   echo 'Build process..' 
			   sh '''
			   cd ${WORKSPACE}/scripts/
			   chmod 755 *.sh
			   '''
		   }
	   }      
	  stage('Python') {
       when { expression {return (params.Language == 'Python' || params.Language == 'All') }
	   }
	   steps {
		    sh ''' echo "running python3 code" 
              cd ${WORKSPACE}/scripts
              ./paython_script.py 
	      '''
	   }
		 
         }
      
      stage('C') {
	      when { expression {return (params.Language == 'C' || params.Language == 'All') }
	   }
         steps {
            echo 'C code'
         }
      }
      stage('Bash') {
	      when { expression {return (params.Language == 'Bash' || params.Language == 'All') }
	   }
         steps {
            sh ''' echo "running bash code" 
              cd ${WORKSPACE}/scripts
              ./bash_script.sh 
	      '''
         }
      }
      stage('Java') {
	      when { expression {return (params.Language == 'Java' || params.Language == 'All') }
	   }
         steps {
            echo 'Java code'
         }
      }
      stage('C#') {
	      when { expression {return (params.Language == 'C#' || params.Language == 'All') }
	   }
         steps {
            echo 'C# code'
         }
      }
      
   }

}
