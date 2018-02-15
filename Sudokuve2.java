import java.util.Scanner;

public class Sudokuve2 {

	public static void main(String[] args) {
		
Scanner a = new Scanner(System.in);
		
		int [][] matriz1 = new int[3][3];
		int [][] matriz2 = new int[3][3];
		int [][] matriz3 = new int[3][3];
		int [][] matriz4 = new int[3][3];
		int [][] matriz5 = new int[3][3];
		int [][] matriz6 = new int[3][3];
		int [][] matriz7 = new int[3][3];
		int [][] matriz8 = new int[3][3];
		int [][] matriz9 = new int[3][3];
		int b = 0;
		int sel = 0;
		int sel2 = 0;
		int selfim = 0;
		int cont1= 10;
		int verify = 0;
		int contjogo = 0;
		int verify2 = 0;
		int finall = 0;
		String tent = null;
		String certeza = null;
		int ver1 = 0;
		int verifycon = 0;
		
		
		
		//CONFIGURAÇÃO/////////////////////////////////////
		
		matriz1[2][0]=6;
		matriz1[1][1]=9;
		matriz1[0][2]=7;
		matriz1[2][2]=8;
		
		matriz2[1][1]=6;
		matriz2[2][1]=8;
		matriz2[2][2]=5;
		
		matriz3[0][0]=5;
		matriz3[2][2]=4;
		matriz3[2][0]=7;
		
		matriz4[2][0]=1;
		matriz4[1][1]=7;
		matriz4[0][2]=3;
		matriz4[2][2]=9;
		
		matriz5[0][0]=5;
		matriz5[1][1]=3;
		matriz5[2][0]=4;
		
		matriz6[0][0]=2;
		matriz6[1][0]=9;
		matriz6[0][2]=7;
		matriz6[1][2]=1;
		
		matriz7[1][0]=5;
		matriz7[1][1]=8;
		matriz7[2][1]=2;
		
		matriz8[1][0]=4;
		matriz8[0][1]=6;
		matriz8[1][2]=2;
		matriz8[2][2]=7;
		
		matriz9[0][0]=8;
		matriz9[2][0]=9;
		matriz9[0][2]=4;
		matriz9[2][2]=6;
		
		
		//CONFIGURAÇÃO/////////////////////////////////////
		
		
		
		
		
		
		//PRIMEIRA MATRIZ//////////////////////////////////////////
		System.out.print("  1  2  3 4  5  6 7  8  9");
		
		System.out.println();
		System.out.print("1|"+matriz1[0][0]+"  ");
		System.out.print(matriz1[1][0]+"  ");
		System.out.print(matriz1[2][0]+"|");
		System.out.print(matriz2[0][0]+"  ");
		System.out.print(matriz2[1][0]+"  ");
		System.out.print(matriz2[2][0]+"|");
		System.out.print(matriz3[0][0]+"  ");
		System.out.print(matriz3[1][0]+"  ");
		System.out.print(matriz3[2][0]+"|");

		System.out.println();
		
		System.out.print("2|"+matriz1[0][1]+"  ");
		System.out.print(matriz1[1][1]+"  ");
		System.out.print(matriz1[2][1]+"|");
		System.out.print(matriz2[0][1]+"  ");
		System.out.print(matriz2[1][1]+"  ");
		System.out.print(matriz2[2][1]+"|");
		System.out.print(matriz3[0][1]+"  ");
		System.out.print(matriz3[1][1]+"  ");
		System.out.print(matriz3[2][1]+"|");

		System.out.println();
		
		System.out.print("3|"+matriz1[0][2]+"  ");
		System.out.print(matriz1[1][2]+"  ");
		System.out.print(matriz1[2][2]+"|");
		System.out.print(matriz2[0][2]+"  ");
		System.out.print(matriz2[1][2]+"  ");
		System.out.print(matriz2[2][2]+"|");
		System.out.print(matriz3[0][2]+"  ");
		System.out.print(matriz3[1][2]+"  ");
		System.out.print(matriz3[2][2]+"|");
	
		System.out.println();
		
		System.out.print(" -");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		
		//SEGUNDA MATRIZ///////////////////////////////////////////
		
		System.out.println();
		
		System.out.print("4|"+matriz4[0][0]+"  ");
		System.out.print(matriz4[1][0]+"  ");
		System.out.print(matriz4[2][0]+"|");
		System.out.print(matriz5[0][0]+"  ");
		System.out.print(matriz5[1][0]+"  ");
		System.out.print(matriz5[2][0]+"|");
		System.out.print(matriz6[0][0]+"  ");
		System.out.print(matriz6[1][0]+"  ");
		System.out.print(matriz6[2][0]+"|");

		System.out.println();
		
		System.out.print("5|"+matriz4[0][1]+"  ");
		System.out.print(matriz4[1][1]+"  ");
		System.out.print(matriz4[2][1]+"|");
		System.out.print(matriz5[0][1]+"  ");
		System.out.print(matriz5[1][1]+"  ");
		System.out.print(matriz5[2][1]+"|");
		System.out.print(matriz6[0][1]+"  ");
		System.out.print(matriz6[1][1]+"  ");
		System.out.print(matriz6[2][1]+"|");

		System.out.println();
		
		System.out.print("6|"+matriz4[0][2]+"  ");
		System.out.print(matriz4[1][2]+"  ");
		System.out.print(matriz4[2][2]+"|");
		System.out.print(matriz5[0][2]+"  ");
		System.out.print(matriz5[1][2]+"  ");
		System.out.print(matriz5[2][2]+"|");
		System.out.print(matriz6[0][2]+"  ");
		System.out.print(matriz6[1][2]+"  ");
		System.out.print(matriz6[2][2]+"|");
	
		System.out.println();
		
		System.out.print(" -");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		
		//TERCEIRA MATRIZ///////////////////////////////////////////
		
		System.out.println();
		
		System.out.print("7|"+matriz7[0][0]+"  ");
		System.out.print(matriz7[1][0]+"  ");
		System.out.print(matriz7[2][0]+"|");
		System.out.print(matriz8[0][0]+"  ");
		System.out.print(matriz8[1][0]+"  ");
		System.out.print(matriz8[2][0]+"|");
		System.out.print(matriz9[0][0]+"  ");
		System.out.print(matriz9[1][0]+"  ");
		System.out.print(matriz9[2][0]+"|");

		System.out.println();
		
		System.out.print("8|"+matriz7[0][1]+"  ");
		System.out.print(matriz7[1][1]+"  ");
		System.out.print(matriz7[2][1]+"|");
		System.out.print(matriz8[0][1]+"  ");
		System.out.print(matriz8[1][1]+"  ");
		System.out.print(matriz8[2][1]+"|");
		System.out.print(matriz9[0][1]+"  ");
		System.out.print(matriz9[1][1]+"  ");
		System.out.print(matriz9[2][1]+"|");

		System.out.println();
		
		System.out.print("9|"+matriz7[0][2]+"  ");
		System.out.print(matriz7[1][2]+"  ");
		System.out.print(matriz7[2][2]+"|");
		System.out.print(matriz8[0][2]+"  ");
		System.out.print(matriz8[1][2]+"  ");
		System.out.print(matriz8[2][2]+"|");
		System.out.print(matriz9[0][2]+"  ");
		System.out.print(matriz9[1][2]+"  ");
		System.out.print(matriz9[2][2]+"|");
	
		System.out.println();
		
		System.out.print(" -");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		System.out.print("-");
		
		//FIM DO EXIBIR///////////////////////////////////////////
		
		
		//INICIO DO FUNCIONAMENTO///////////////////////////////////
		
		
		System.out.println();
		System.out.println("Bem-Vindo ao meu jogo(Sudoku) considere que o 0 é igual a nulo :)");
		System.out.println();
		while(b==0){
		while(contjogo<49){
			System.out.println();
			System.out.println("Para selecionar o zero que deseja mudar considere que o primeiro numero é para escolher na horizontal e o segundo na vertical!");
			System.out.println();
			
			
			
			System.out.println("Selecione o '0' que deseja mudar(horizontal):");
			sel = a.nextInt();
			
			System.out.println("Selecione o '0' que deseja mudar(vertical):");
			sel2 = a.nextInt();
			
			//VERIFICAÇÃO DO 'SEL'///////////////////
			
			if(sel>9 || sel<1){
				
				System.out.println("Selecione um '0' valido!!!");
				System.out.println();
				verify2=1;
			}
			 if(sel2>9 || sel2<1){
				
				System.out.println("Selecione um '0' valido!!!");
				System.out.println();
				verify2=1;
			}
			
			 if(sel<4 && sel2<4){
				
				verify=matriz1[sel-1][sel2-1];


			}
			
			 if(sel>3 && sel<7 && sel2<4){
				
				verify=matriz2[sel-4][sel2-1];


			}
			 if(sel>6 && sel<10 && sel2<4){
				
				verify=matriz3[sel-7][sel2-1];


			}
			
			 if(sel<4 && sel2<7 && sel2>3){
				
				verify=matriz4[sel-1][sel2-4];


			}

			 if(sel>3 && sel<7 && sel2>3 && sel2<7){
				
				verify=matriz5[sel-4][sel2-4];


			}
	
			 if(sel>6 && sel<10 && sel2>3 && sel2<7){
				
				verify=matriz6[sel-7][sel2-4];


			}
	
			 if(sel<4 && sel2>6){
				
				verify=matriz7[sel-1][sel2-7];


			}
	
			 if(sel>3 && sel<7 && sel2>6 && sel2<10){
				
				verify=matriz8[sel-4][sel2-7];


			}
	
			 if(sel>6 && sel<10 && sel2>6 && sel2<10){
				
				verify=matriz9[sel-7][sel2-7];


			}
	
			
			 if(verify!=0){
				
				System.out.println("Escolha um lugar vazio!!!");
				verify2=1;
			}
			//VERIFICAÇÃO DO 'SEL'///////////////////////////
			
			//ESCOLHA DE NUMERO//////////////////////////////////
			 
			 if(verify2==0){
				
				
				System.out.println("Digite qual numero quer colocar nele(1 a 9):");
				selfim = a.nextInt();
				
				//VERIFICAÇÃO MATRIZ 1////
				if(sel==1 && sel2==1 ||sel==1 && sel2==2 ||sel==1 && sel2==3 ||sel==2 && sel2==1 ||sel==2 && sel2==2 ||sel==2 && sel2==3 ||sel==3 && sel2==1 ||sel==3 && sel2==2 ||sel==3 && sel2==3){
				
					int mudmat = 0;
					int i = -1;
					while(verifycon==0 && i!=8){
						
						
							while(i!=8){
								i++;
								
									if(i==3){
								
										mudmat=1;
								
									}
									if(i==6){
								
										mudmat=2;
									
									}
								
									if(matriz1[0][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz1[1][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz1[2][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz1[0][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz1[1][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz1[2][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz1[0][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz1[1][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz1[2][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									
									
								
								if(mudmat==0 && matriz1[i][sel2-1]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==1 && matriz2[i-3][sel2-1]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==2 && matriz3[i-6][sel2-1]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}	
							}
						}
				
					 mudmat = 0;
					 i = -1;
					while(verifycon==0 && i!=8){
						
						
							while(i!=8){
								i++;
								
									if(i==3){
								
										mudmat=1;
								
									}
									if(i==6){
								
										mudmat=2;
									
									}
								
								
								if(mudmat==0 && matriz1[sel-1][i]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==1 && matriz4[sel-1][i-3]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==2 && matriz7[sel-1][i-6]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}	
							}
						}
					}
				
			
				//VERIFICAÇÃO MATRIZ 2////
				if(sel==4 && sel2==1 ||sel==4 && sel2==2 ||sel==4 && sel2==3 ||sel==5 && sel2==1 ||sel==5 && sel2==2 ||sel==5 && sel2==3 ||sel==6 && sel2==1 ||sel==6 && sel2==2 ||sel==6 && sel2==3){
					
					
					
					int mudmat = 0;
					int i = -1;
					while(verifycon==0 && i!=8){
						
						
							while(i!=8){
								i++;
								
									if(i==3){
								
										mudmat=1;
								
									}
									if(i==6){
								
										mudmat=2;
									
									}

									if(matriz2[0][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz2[1][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz2[2][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz2[0][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz2[1][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz2[2][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz2[0][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz2[1][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz2[2][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									
								
								if(mudmat==0 && matriz1[i][sel2-1]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==1 && matriz2[i-3][sel2-1]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==2 && matriz3[i-6][sel2-1]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}	
							}
						}
				
					 mudmat = 0;
					 i = -1;
					while(verifycon==0 && i!=8){
						
						
							while(i!=8){
								i++;
								
									if(i==3){
								
										mudmat=1;
								
									}
									if(i==6){
								
										mudmat=2;
									
									}
								
								
								if(mudmat==0 && matriz2[sel-4][i]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==1 && matriz5[sel-4][i-3]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==2 && matriz8[sel-4][i-6]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}	
							}
						}
					}
				
				
				
				//VERIFICAÇÃO MATRIZ 3////
				
				if(sel==7 && sel2==1 ||sel==7 && sel2==2 ||sel==7 && sel2==3 ||sel==8 && sel2==1 ||sel==8 && sel2==2 ||sel==8 && sel2==3 ||sel==9 && sel2==1 ||sel==9 && sel2==2 ||sel==9 && sel2==3){
					
					int mudmat = 0;
					int i = -1;
					while(verifycon==0 && i!=8){
						
						
							while(i!=8){
								i++;
								
									if(i==3){
								
										mudmat=1;
								
									}
									if(i==6){
								
										mudmat=2;
									
									}

									if(matriz3[0][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz3[1][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz3[2][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz3[0][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz3[1][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz3[2][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz3[0][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz3[1][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz3[2][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									
								
								if(mudmat==0 && matriz1[i][sel2-1]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==1 && matriz2[i-3][sel2-1]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==2 && matriz3[i-6][sel2-1]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}	
							}
						}
				
					 mudmat = 0;
					 i = -1;
					while(verifycon==0 && i!=8){
						
						
							while(i!=8){
								i++;
								
									if(i==3){
								
										mudmat=1;
								
									}
									if(i==6){
								
										mudmat=2;
									
									}
								
								
								if(mudmat==0 && matriz3[sel-7][i]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==1 && matriz6[sel-7][i-3]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==2 &&matriz9[sel-7][i-6]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}	
							}
						}
					}
				
				
				//VERIFICAÇÃO MATRIZ 4////
				
				if(sel==1 && sel2==4 ||sel==1 && sel2==5 ||sel==1 && sel2==6 ||sel==2 && sel2==4 ||sel==2 && sel2==5 ||sel==2 && sel2==6 ||sel==3 && sel2==4 ||sel==3 && sel2==5 ||sel==3 && sel2==6){
					
					int mudmat = 0;
					int i = -1;
					while(verifycon==0 && i!=8){
						
						
							while(i!=8){
								i++;
								
									if(i==3){
								
										mudmat=1;
								
									}
									if(i==6){
								
										mudmat=2;
									
									}

									if(matriz4[0][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz4[1][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz4[2][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz4[0][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz4[1][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz4[2][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz4[0][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz4[1][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz4[2][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									
								
								if(mudmat==0 && matriz4[i][sel2-4]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==1 && matriz5[i-3][sel2-4]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==2 && matriz6[i-6][sel2-4]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}	
							}
						}
				
					 mudmat = 0;
					 i = -1;
					while(verifycon==0 && i!=8){
						
						
							while(i!=8){
								i++;
								
									if(i==3){
								
										mudmat=1;
								
									}
									if(i==6){
								
										mudmat=2;
									
									}
								
								
								if(mudmat==0 && matriz1[sel-1][i]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==1 && matriz4[sel-1][i-3]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==2 && matriz7[sel-1][i-6]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}	
							}
						}
					}
				
				
				
				
				
					//VERIFICAÇÃO MATRIZ 5////
				
				if(sel==4 && sel2==4 ||sel==4 && sel2==5 ||sel==4 && sel2==6 ||sel==5 && sel2==4 ||sel==5 && sel2==5 ||sel==5 && sel2==6 ||sel==6 && sel2==4 ||sel==6 && sel2==5 ||sel==6 && sel2==6){
					
					int mudmat = 0;
					int i = -1;
					while(verifycon==0 && i!=8){
						
						
							while(i!=8){
								i++;
								
									if(i==3){
								
										mudmat=1;
								
									}
									if(i==6){
								
										mudmat=2;
									
									}
								

									if(matriz5[0][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz5[1][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz5[2][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz5[0][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz5[1][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz5[2][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz5[0][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz5[1][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz5[2][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									
								if(mudmat==0 && matriz4[i][sel2-4]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==1 && matriz5[i-3][sel2-4]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==2 && matriz6[i-6][sel2-4]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}	
							}
						}
				
					 mudmat = 0;
					 i = -1;
					while(verifycon==0 && i!=8){
						
						
							while(i!=8){
								i++;
								
									if(i==3){
								
										mudmat=1;
								
									}
									if(i==6){
								
										mudmat=2;
									
									}
								
								
								if(mudmat==0 && matriz2[sel-4][i]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==1 && matriz5[sel-4][i-3]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==2 && matriz8[sel-4][i-6]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}	
							}
						}
					}
				
				
				
					//VERIFICAÇÃO MATRIZ 6////
				
				if(sel==7 && sel2==4 ||sel==7 && sel2==5 ||sel==7 && sel2==6 ||sel==8 && sel2==4 ||sel==8 && sel2==5 ||sel==8 && sel2==6 ||sel==9 && sel2==4 ||sel==9 && sel2==5 ||sel==9 && sel2==6){
					
					int mudmat = 0;
					int i = -1;
					while(verifycon==0 && i!=8){
						
						
							while(i!=8){
								i++;
								
									if(i==3){
								
										mudmat=1;
								
									}
									if(i==6){
								
										mudmat=2;
									
									}

									if(matriz6[0][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz6[1][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz6[2][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz6[0][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz6[1][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz6[2][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz6[0][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz6[1][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz6[2][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									
								
								if(mudmat==0 && matriz4[i][sel2-4]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==1 && matriz5[i-3][sel2-4]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==2 && matriz6[i-6][sel2-4]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}	
							}
						}
				
					 mudmat = 0;
					 i = -1;
					while(verifycon==0 && i!=8){
						
						
							while(i!=8){
								i++;
								
									if(i==3){
								
										mudmat=1;
								
									}
									if(i==6){
								
										mudmat=2;
									
									}
								
								
								if(mudmat==0 && matriz3[sel-7][i]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==1 && matriz6[sel-7][i-3]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==2 && matriz9[sel-7][i-6]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}	
							}
						}
					}
				
					//VERIFICAÇÃO MATRIZ 7////
				
				if(sel==1 && sel2==7 ||sel==1 && sel2==8 ||sel==1 && sel2==9 ||sel==2 && sel2==7 ||sel==2 && sel2==8 ||sel==2 && sel2==9 ||sel==3 && sel2==7 ||sel==5 && sel2==8 ||sel==3 && sel2==9){
					
					int mudmat = 0;
					int i = -1;
					while(verifycon==0 && i!=8){
						
						
							while(i!=8){
								i++;
								
									if(i==3){
								
										mudmat=1;
								
									}
									if(i==6){
								
										mudmat=2;
									
									}
								

									if(matriz7[0][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz7[1][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz7[2][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz7[0][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz7[1][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz7[2][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz7[0][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz7[1][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz7[2][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									
								if(mudmat==0 && matriz7[i][sel2-7]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==1 && matriz8[i-3][sel2-7]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==2 && matriz9[i-6][sel2-7]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}	
							}
						}
				
					 mudmat = 0;
					 i = -1;
					while(verifycon==0 && i!=8){
						
						
							while(i!=8){
								i++;
								
									if(i==3){
								
										mudmat=1;
								
									}
									if(i==6){
								
										mudmat=2;
									
									}
								
								
								if(mudmat==0 && matriz1[sel-1][i]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==1 && matriz4[sel-1][i-3]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==2 && matriz7[sel-1][i-6]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}	
							}
						}
					}
				
					//VERIFICAÇÃO MATRIZ 8////
				
				if(sel==4 && sel2==7 ||sel==4 && sel2==8 ||sel==4 && sel2==9 ||sel==5 && sel2==7 ||sel==5 && sel2==8 ||sel==5 && sel2==9 ||sel==6 && sel2==7 ||sel==6 && sel2==8 ||sel==6 && sel2==9){
					
					int mudmat = 0;
					int i = -1;
					while(verifycon==0 && i!=8){
						
						
							while(i!=8){
								i++;
								
									if(i==3){
								
										mudmat=1;
								
									}
									if(i==6){
								
										mudmat=2;
									
									}
								

									if(matriz8[0][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz8[1][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz8[2][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz8[0][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz8[1][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz8[2][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz8[0][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz8[1][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz8[2][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									
								if(mudmat==0 && matriz7[i][sel2-7]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==1 && matriz8[i-3][sel2-7]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==2 && matriz9[i-6][sel2-7]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}	
							}
						}
				
					 mudmat = 0;
					 i = -1;
					while(verifycon==0 && i!=8){
						
						
							while(i!=8){
								i++;
								
									if(i==3){
								
										mudmat=1;
								
									}
									if(i==6){
								
										mudmat=2;
									
									}
								
								
								if(mudmat==0 && matriz2[sel-4][i]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==1 && matriz5[sel-4][i-3]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==2 && matriz8[sel-4][i-6]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}	
							}
						}
					}
				
					//VERIFICAÇÃO MATRIZ 9////
				
				if(sel==7 && sel2==7 ||sel==7 && sel2==8 ||sel==7 && sel2==9 ||sel==8 && sel2==7 ||sel==8 && sel2==8 ||sel==8 && sel2==9 ||sel==9 && sel2==7 ||sel==9 && sel2==8 ||sel==9 && sel2==9){
					
					int mudmat = 0;
					int i = -1;
					while(verifycon==0 && i!=8){
						
						
							while(i!=8){
								i++;
								
									if(i==3){
								
										mudmat=1;
								
									}
									if(i==6){
								
										mudmat=2;
									
									}
								

									if(matriz9[0][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz9[1][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz9[2][0]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz9[0][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz9[1][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz9[2][1]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz9[0][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz9[1][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									if(matriz9[2][2]==selfim){
										System.out.println("Se fizer isso você ira perder!!!");
										verifycon=1;
									}
									
								if(mudmat==0 && matriz7[i][sel2-7]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==1 && matriz8[i-3][sel2-7]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==2 && matriz9[i-6][sel2-7]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}	
							}
						}
				
					 mudmat = 0;
					 i = -1;
					while(verifycon==0 && i!=8){
						
						
							while(i!=8){
								i++;
								
									if(i==3){
								
										mudmat=1;
								
									}
									if(i==6){
								
										mudmat=2;
									
									}
								
								
								if(mudmat==0 && matriz3[sel-7][i]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==1 && matriz6[sel-7][i-3]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}
								if(mudmat==2 && matriz9[sel-7][i-6]==selfim){
									System.out.println("Se fizer isso você ira perder!!!");
									verifycon=1;
								}	
							}
						}
					}
				
				
			if(verifycon==0){	
					if(selfim>9 || selfim<1){
					
					System.out.println("Digite um numero Valido!!!");
					System.out.println();
				
				}
			
				
				
				
			
				
				else{
						if(sel<4 && sel2<4){
		
							matriz1[sel-1][sel2-1]=selfim;
			
			
						}
						
						if(sel>3 && sel<7 && sel2<4){
							
							matriz2[sel-4][sel2-1]=selfim;
		
		
						}
						if(sel>6 && sel<10 && sel2<4){
							
							matriz3[sel-7][sel2-1]=selfim;
		
		
						}
						
						if(sel<4 && sel2<7 && sel2>3){
							
							matriz4[sel-1][sel2-4]=selfim;
		
		
						}
			
						if(sel>3 && sel<7 && sel2>3 && sel2<7){
							
							matriz5[sel-4][sel2-4]=selfim;
		
		
						}
				
						if(sel>6 && sel<10 && sel2>3 && sel2<7){
							
							matriz6[sel-7][sel2-4]=selfim;
		
		
						}
				
						if(sel<4 && sel2>6){
							
							matriz7[sel-1][sel2-7]=selfim;
		
		
						}
				
						if(sel>3 && sel<7 && sel2>6 && sel2<10){
							
							matriz8[sel-4][sel2-7]=selfim;
		
		
						}
				
						if(sel>6 && sel<10 && sel2>6 && sel2<10){
							
							matriz9[sel-7][sel2-7]=selfim;
		
		
						}
						}
						}
						//ESCOLHA DE NUMERO//////////////////////////////////
						
				
				
						//PRIMEIRA MATRIZ//////////////////////////////////////////
						
						System.out.println("");
						System.out.print("  1  2  3 4  5  6 7  8  9");
						
						System.out.println();
						System.out.print("1|"+matriz1[0][0]+"  ");
						System.out.print(matriz1[1][0]+"  ");
						System.out.print(matriz1[2][0]+"|");
						System.out.print(matriz2[0][0]+"  ");
						System.out.print(matriz2[1][0]+"  ");
						System.out.print(matriz2[2][0]+"|");
						System.out.print(matriz3[0][0]+"  ");
						System.out.print(matriz3[1][0]+"  ");
						System.out.print(matriz3[2][0]+"|");

						System.out.println();
						
						System.out.print("2|"+matriz1[0][1]+"  ");
						System.out.print(matriz1[1][1]+"  ");
						System.out.print(matriz1[2][1]+"|");
						System.out.print(matriz2[0][1]+"  ");
						System.out.print(matriz2[1][1]+"  ");
						System.out.print(matriz2[2][1]+"|");
						System.out.print(matriz3[0][1]+"  ");
						System.out.print(matriz3[1][1]+"  ");
						System.out.print(matriz3[2][1]+"|");

						System.out.println();
						
						System.out.print("3|"+matriz1[0][2]+"  ");
						System.out.print(matriz1[1][2]+"  ");
						System.out.print(matriz1[2][2]+"|");
						System.out.print(matriz2[0][2]+"  ");
						System.out.print(matriz2[1][2]+"  ");
						System.out.print(matriz2[2][2]+"|");
						System.out.print(matriz3[0][2]+"  ");
						System.out.print(matriz3[1][2]+"  ");
						System.out.print(matriz3[2][2]+"|");
					
						System.out.println();
						
						System.out.print(" -");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						
						//SEGUNDA MATRIZ///////////////////////////////////////////
						
						System.out.println();
						
						System.out.print("4|"+matriz4[0][0]+"  ");
						System.out.print(matriz4[1][0]+"  ");
						System.out.print(matriz4[2][0]+"|");
						System.out.print(matriz5[0][0]+"  ");
						System.out.print(matriz5[1][0]+"  ");
						System.out.print(matriz5[2][0]+"|");
						System.out.print(matriz6[0][0]+"  ");
						System.out.print(matriz6[1][0]+"  ");
						System.out.print(matriz6[2][0]+"|");

						System.out.println();
						
						System.out.print("5|"+matriz4[0][1]+"  ");
						System.out.print(matriz4[1][1]+"  ");
						System.out.print(matriz4[2][1]+"|");
						System.out.print(matriz5[0][1]+"  ");
						System.out.print(matriz5[1][1]+"  ");
						System.out.print(matriz5[2][1]+"|");
						System.out.print(matriz6[0][1]+"  ");
						System.out.print(matriz6[1][1]+"  ");
						System.out.print(matriz6[2][1]+"|");

						System.out.println();
						
						System.out.print("6|"+matriz4[0][2]+"  ");
						System.out.print(matriz4[1][2]+"  ");
						System.out.print(matriz4[2][2]+"|");
						System.out.print(matriz5[0][2]+"  ");
						System.out.print(matriz5[1][2]+"  ");
						System.out.print(matriz5[2][2]+"|");
						System.out.print(matriz6[0][2]+"  ");
						System.out.print(matriz6[1][2]+"  ");
						System.out.print(matriz6[2][2]+"|");
					
						System.out.println();
						
						System.out.print(" -");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						
						//TERCEIRA MATRIZ///////////////////////////////////////////
						
						System.out.println();
						
						System.out.print("7|"+matriz7[0][0]+"  ");
						System.out.print(matriz7[1][0]+"  ");
						System.out.print(matriz7[2][0]+"|");
						System.out.print(matriz8[0][0]+"  ");
						System.out.print(matriz8[1][0]+"  ");
						System.out.print(matriz8[2][0]+"|");
						System.out.print(matriz9[0][0]+"  ");
						System.out.print(matriz9[1][0]+"  ");
						System.out.print(matriz9[2][0]+"|");

						System.out.println();
						
						System.out.print("8|"+matriz7[0][1]+"  ");
						System.out.print(matriz7[1][1]+"  ");
						System.out.print(matriz7[2][1]+"|");
						System.out.print(matriz8[0][1]+"  ");
						System.out.print(matriz8[1][1]+"  ");
						System.out.print(matriz8[2][1]+"|");
						System.out.print(matriz9[0][1]+"  ");
						System.out.print(matriz9[1][1]+"  ");
						System.out.print(matriz9[2][1]+"|");

						System.out.println();
						
						System.out.print("9|"+matriz7[0][2]+"  ");
						System.out.print(matriz7[1][2]+"  ");
						System.out.print(matriz7[2][2]+"|");
						System.out.print(matriz8[0][2]+"  ");
						System.out.print(matriz8[1][2]+"  ");
						System.out.print(matriz8[2][2]+"|");
						System.out.print(matriz9[0][2]+"  ");
						System.out.print(matriz9[1][2]+"  ");
						System.out.print(matriz9[2][2]+"|");
					
						System.out.println();
						
						System.out.print(" -");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						System.out.print("-");
						
						//FIM DO EXIBIR///////////////////////////////////////////
				
					//DESISTIR///////////////////////////////////////////
						
						
				int teste = 0;
				if(teste==0){
					System.out.println();
					System.out.println("Deseja sair do jogo?(sim ou não):");
					certeza = a.nextLine();
					teste++;
				}
						
				System.out.println();
				System.out.println("Deseja sair do jogo?(sim ou não):");
				certeza = a.nextLine();
				
				switch (certeza){
				
				case "sim":
					
					System.exit(0);
				
				case "não":
					
					break;
					
				default:
					
					break;
				
				
				}
				//DESISTIR///////////////////////////////////////////
				if(verifycon==0)
				contjogo++;

				}
	
		verifycon=0;
		}
		//FIM DO FUNCIONAMENTO///////////////////////////////////
		
		
		//INICIO DA VERIFICAÇÃO///////////////////////////////
		finall=0;
		
		
		if(matriz1[0][0]!=1 && ver1==0){
			
			System.out.println("Você perdeu.");
			System.out.println();
			System.out.println("Deseja tentar denovo?(sim ou não)");
			tent = a.nextLine();
			
			switch(tent){
			case "sim":finall=1;ver1=1;
			break;
			
			case "não":
			System.exit(0);
			
			default:
			System.exit(0);
			
			
			}
		}
		
	if(matriz1[1][0]!=3 && ver1==0){
			
			System.out.println("Você perdeu.");
			System.out.println();
			System.out.println("Deseja tentar denovo?(sim ou não)");
			tent = a.nextLine();
			
			switch(tent){
			case "sim":finall=1;ver1=1;
			break;
			
			case "não":
			System.exit(0);
			
			default:
			System.exit(0);
			
			
			}
		}
		
	if(matriz1[0][1]!=5 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}
	if(matriz1[1][2]!=2 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}
	if(matriz1[2][1]!=4 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}
	if(matriz2[0][0]!=4 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz2[1][0]!=9 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz2[2][0]!=2 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz2[0][1]!=7 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz2[0][2]!=3 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz2[1][2]!=1 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz2[2][2]!=5 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz3[1][0]!=8 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz3[0][1]!=1 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz3[1][1]!=3){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz3[2][1]!=2 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz3[2][0]!=9){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz3[1][2]!=6 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz4[0][0]!=8 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz4[1][0]!=6 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz4[0][1]!=2 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz4[2][1]!=5 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz4[1][2]!=4 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz5[1][0]!=7 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz5[0][1]!=9 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz5[2][1]!=1 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz5[2][0]!=2 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz5[2][1]!=8 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz5[2][2]!=6 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz6[0][0]!=4 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz6[2][0]!=3 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz6[0][1]!=6 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz6[1][1]!=4 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz6[2][1]!=8 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz6[2][2]!=5 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz7[0][0]!=4 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz7[0][0]!=6 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz7[2][0]!=7 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz7[0][1]!=4 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz7[0][2]!=9 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz7[1][2]!=1 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz7[0][0]!=4 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz7[2][2]!=3 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz8[0][0]!=1 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz8[2][0]!=3 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz8[1][1]!=5 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz8[2][1]!=9 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz8[0][2]!=8 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz9[1][0]!=2 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz9[0][1]!=3 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz9[1][1]!=7 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz9[2][1]!=1 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}if(matriz9[1][2]!=5 && ver1==0){
		
		System.out.println("Você perdeu.");
		System.out.println();
		System.out.println("Deseja tentar denovo?(sim ou não)");
		tent = a.nextLine();
		
		switch(tent){
		case "sim":finall=1;ver1=1;
		break;
		
		case "não":
		System.exit(0);
		
		default:
		System.exit(0);
		
		
		}
	}
	
	
	if(finall==0){
	System.out.println("Parabens, Você ganhou!!!!!!!!!!");
	}
	}
		
		
		
		}}