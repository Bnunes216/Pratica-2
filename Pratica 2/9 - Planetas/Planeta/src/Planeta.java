import javax.swing.JOptionPane;

public class Planeta {
public static void main(String[] args) {
    // TODO code application logic here
    StringBuilder mensagem = new StringBuilder();

double velocidade, instante, cv, ch;
int planeta, cond;

do{

planeta = Integer.parseInt(JOptionPane.showInputDialog("Escolha em qual planeta deseja fazer a simulaço:\n1)Mercurio\n2)Venus\n3)Terra\n4)Marte\n5)Jupiter\n6)Saturno\n7)Urano\n8)netuno\n9)Plutao"));
velocidade = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma velocidade em metros por segundo(m/s)"));
instante = Integer.parseInt(JOptionPane.showInputDialog("Escolha um instante"));


if(planeta ==1){

cv = (velocidade) - (3.7 * instante);
ch = (velocidade * instante) - ((3.7*3.7)/ 2);
mensagem.append("\nA v(t) e: ").append(cv).append("\ne a h(t) e:").append(ch);
JOptionPane.showMessageDialog(null,mensagem); 

}else if(planeta ==2){

cv = (velocidade) - (8.8 * instante);
ch = (velocidade * instante) - ((8.8*8.8)/ 2);
mensagem.append("\nA v(t) e: ").append(cv).append("\ne a h(t) e:").append(ch);
JOptionPane.showMessageDialog(null,mensagem); 

}else if(planeta ==3){

cv = (velocidade) - (9.8 * instante);
ch = (velocidade * instante) - ((9.8*9.8)/ 2);
mensagem.append("\nA v(t) e: ").append(cv).append("\ne a h(t) e:").append(ch);
JOptionPane.showMessageDialog(null,mensagem); 

}else if(planeta ==4){

cv = (velocidade) - (3.8 * instante);
ch = (velocidade * instante) - ((3.8*3.8)/ 2);
mensagem.append("\nA v(t) e: ").append(cv).append("\ne a h(t) e:").append(ch);
JOptionPane.showMessageDialog(null,mensagem); 

}else if(planeta ==5){

cv = (velocidade) - (26.4 * instante);
ch = (velocidade * instante) - ((26.4*26.4)/ 2);
mensagem.append("\nA v(t) e: ").append(cv).append("\ne a h(t) e:").append(ch);
JOptionPane.showMessageDialog(null,mensagem); 

}else if(planeta ==6){

cv = (velocidade) - (11.5 * instante);
ch = (velocidade * instante) - ((11.5*11.5)/ 2);
mensagem.append("\nA v(t) e: ").append(cv).append("\ne a h(t) e:").append(ch);
JOptionPane.showMessageDialog(null,mensagem); 

}else if(planeta ==7){

cv = (velocidade) - (9.3 * instante);
ch = (velocidade * instante) - ((9.3*9.3)/ 2);
mensagem.append("\nA v(t) e: ").append(cv).append("\ne a h(t) e:").append(ch);
JOptionPane.showMessageDialog(null,mensagem); 

}else if(planeta ==8){

cv = (velocidade) - (12.2 * instante);
ch = (velocidade * instante) - ((12.2*12.2)/ 2);
mensagem.append("\nA v(t) e: ").append(cv).append("\ne a h(t) e:").append(ch);
JOptionPane.showMessageDialog(null,mensagem); 

}else if(planeta ==9){

cv = (velocidade) - (0.6 * instante);
ch = (velocidade * instante) - ((0.6*0.6)/ 2);
mensagem.append("\nA v(t) e: ").append(cv).append("\ne a h(t) e:").append(ch);
JOptionPane.showMessageDialog(null,mensagem); 

}

cond = Integer.parseInt(JOptionPane.showInputDialog("Quer continuar calculando?\n1) Sim    \n2) Nao"));
}while(cond == 1);      
    
System.exit(0);
}
}
