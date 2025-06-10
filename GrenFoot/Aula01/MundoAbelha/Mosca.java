import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Aqui é a Classe Mosca.
 * 
 * @author Anderson Brandão 
 * @version 2025-06-03
 */
public class Mosca extends Inseto
{
    //Constructor padrao
    private int velocidade;
    private int rotacao;
    public Mosca (){
        velocidade = 1;
        rotacao = 0;
    }
    //Constructor com parametros
    public Mosca(int vel,int rot){
        velocidade = vel;
        rotacao = rot;
        setRotation(rot);
    }
    /**
     * Act - Metodo responsavel pelas ações da mosca quando    
     * os botões Act ou Run são pressionados.
     */
    public void act()
    {
        // Add your action code here.
        move (1);
        if (Greenfoot.getRandomNumber(100)<20){
            turn(45-Greenfoot.getRandomNumber(98));

        } 
        if (isAtEdge()) { //esta em um canto
            turn (180);
        }        

    }
}
