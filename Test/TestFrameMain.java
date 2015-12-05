import com.BaseGoods.Client.BaseData.Base;
import com.BaseGoods.Client.BaseData.OnlineData.BaseSQL;
import com.BaseGoods.Client.GUI.client.FrameMain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by HNKNTOC on 14.10.2015.
 */
public class TestFrameMain {
    public static void main(String[] args) {
        Base base = new BaseSQL();
        try {
            base.connectBase();
        } catch (Exception e) {
            e.printStackTrace();
        }
        FrameMain frameMain = new FrameMain("Test",base);
        frameMain.addButtonPanelGoods("Кнопка теста", new testListner());
        frameMain.addButton("Test", new testListner());

        frameMain.start();
    }

    public static class testListner implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Клик!");
        }
    }
}
