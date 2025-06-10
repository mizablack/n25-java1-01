import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Aqui é a Classe Mosca.
 * 
 * @author Mizael Silva
 * @version 2025-06-03
 */
public class Mosca extends Inseto
{
    // Fields
    private int velocidade;
    private int rotacao;
    //Constructor padrão
    public Mosca(){
        velocidade = 1;
        rotacao =0;
    }
    //Constructor com paramentros
    public Mosca(int vel,int rot){
        velocidade = vel;
        rotacao = rot;
        setRotation(rot);
    }
    
    /**
     * Act - Método responsavel pelas ações da mosca quando
     *  os botões 'Act' or 'Run' são pressionados.
     */
    public void act()
    {
        // Add your action code here.
        move(velocidade);
        if (Greenfoot.getRandomNumber(100)<20){
            turn(45-Greenfoot.getRandomNumber(90));
            
        }
        if(isAtEdge()){ //esta em um canto
            turn(180);
        }
    }
}
