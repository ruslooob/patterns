package com.ruslooob.structural.decorator;

public abstract class Button extends Component {
    protected String hoverAnimation;

    public Button() {
       super();
       this.hoverAnimation = "default button hover animation";
    }

    public String getAnimation() {
        return hoverAnimation;
    }

    public void setAnimation(String animation) {
        this.hoverAnimation = animation;
    }

    public abstract void render();

}
