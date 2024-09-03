package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString

public class Menu {
    private List<Item> elementiMenu;

    public Menu() {
        this.elementiMenu = new ArrayList<>();
    }

    public void addElemento(Item elemento){
        elementiMenu.add(elemento);
    }

    public void stampaMenu() {
        elementiMenu.forEach(System.out::println);
    }

    public List<Item> getElementiMenu() {
        return elementiMenu;
    }

    public void setElementiMenu(List<Item> elementiMenu) {
        this.elementiMenu = elementiMenu;
    }


}
