package fragmentexample.rahul.com.fragmentexample.sectioned;

import java.util.ArrayList;

import fragmentexample.rahul.com.fragmentexample.Item;

/**
 * Created by hadoop on 30/3/16.
 */
public class SectionedData {
    private String headerTitle;
    private ArrayList<Item> itemsInSection;


    public SectionedData() {

    }
    public SectionedData(String headerTitle, ArrayList<Item> itemsInSection) {
        this.headerTitle = headerTitle;
        this.itemsInSection = itemsInSection;
    }

    public String getHeaderTitle() {
        return headerTitle;
    }

    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    public ArrayList<Item> getItemsInSection() {
        return itemsInSection;
    }

    public void setItemsInSection(ArrayList<Item> itemsInSection) {
        this.itemsInSection = itemsInSection;
    }
}
