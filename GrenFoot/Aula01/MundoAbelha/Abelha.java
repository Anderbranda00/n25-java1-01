import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Abelha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Abelha extends Actor
{
    /**
     * Act - do whatever the Abelha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here. 
        move(1);
        if (Greenfoot.isKeyDown("Left")){
            turn(-5);

        }
        if (Greenfoot.isKeyDown("Right")){
            turn(5);

        }
        verificarPosiçao();
    }
    /**
     * verifica posicao da abelha
     */
    public void verificarPosiçao(){
        if (estaNoTopo()){
            setLocation(getX(), getWorld().getHeight()-10);
        }
        if (estaNaBase()){
            setLocation(getX(), 10);
        }
        if (estaNaDireita()){
            setLocation(10, getY());
        }
        if (estaNaEsquerda()){
            setLocation(getWorld().getWidth()-10,getY());
        }
    }

    /**
     * Metodo que verifica se abelha esta no topo
     */

    public boolean estaNoTopo(){
        if(getY()<10){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Metodo que verifica se abelha esta na base
     */
    public boolean estaNaBase(){
        return getY()>getWorld().getHeight()-10;
    }

    /**
     * Metodo que verifica se abelha esta na esquerda
     */
    public boolean estaNaEsquerda(){
        return getX()<10;

    }

    /**
     * Metodo que verifica se abelha esta na direita
     */
    public boolean estaNaDireita(){
        return getX()>getWorld().getWidth()-10;
    }
}