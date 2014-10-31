import java.io.BufferedReader;
import java.io.InputStreamReader;

class arrayoperations {	
	public static int matrix_size;
	public static int matrix[][];
	public static int temp_matrix[][];
	public static BufferedReader buffer_instance = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		matrix_size = Integer.parseInt(buffer_instance.readLine());
		matrix = new int[matrix_size][matrix_size];
		temp_matrix = new int[matrix_size][matrix_size];
		
		//Split Input
		for(int m=0; m<matrix_size; m++){
			String stringed_input = buffer_instance.readLine();
			final String delimiter = ",";
			final String[] temp = stringed_input.split(delimiter);			
			for(int n=0; n<temp.length;n++){
				matrix[m][n] = Integer.parseInt(temp[n]);
			}
			
		}
		
		String sequence = buffer_instance.readLine();
		int loop=0;
		while(loop!=sequence.length())
		{
			char sequence_character = sequence.charAt(loop++);
			final int ascii = (int) sequence_character;
			if(ascii==92){
				for (int r = 0; r < matrix_size; r++) {
			        for (int c = 0; c < matrix_size; c++) {
			            temp_matrix[r][c] = matrix[c][r];
			        }
			    }
				array_copy();
			}
			else{
				switch(sequence_character){
					case 'C': 
						for (int r = 0; r < matrix_size; r++) {
					        for (int c = 0; c < matrix_size; c++) {
					            temp_matrix[c][matrix_size-1-r] = matrix[r][c];
					        }
					    	}
						array_copy();
						break;
					case 'A': 
						for (int r = matrix_size-1, i=0; r >= 0; r--, i++) {
							for (int c = 0; c < matrix_size; c++) {
				            temp_matrix[i][c] = matrix[c][r];
				            }
							}
						array_copy();
						break;
					case 'T': 
						for (int r = 0; r < matrix_size; r++) {
					        for (int c = 0; c < matrix_size; c++) {
					            temp_matrix[r][c] = matrix[c][r];
					        }
					    }
						array_copy();
						break;
					case '/':
						for(int r = matrix_size-1, i=0; r >=0; r--, i++)
							for(int c=matrix_size-1, j=0; c >=0; c--, j++)
								temp_matrix[i][j] = matrix[c][r];
						array_copy();
						break;
					default: break;
				}
			}
		}
		if(loop==sequence.length())
			for(int m=0; m<matrix_size;m++){
				System.out.println();
				for(int n=0; n<matrix_size; n++)
				{
					if(n!=0)
						System.out.print(",");
					System.out.print(temp_matrix[m][n]);
				}
			}		
	}

	public static void array_copy(){
		for(int m=0; m<matrix_size;m++){
			for(int n=0; n<matrix_size; n++)
			{
				matrix[m][n] = temp_matrix[m][n];
			}
		}
	}
}
