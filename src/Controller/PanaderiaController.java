package Controller;

import Model.Panaderia;
import java.util.ArrayList;

public class PanaderiaController {

    Panaderia p1 = new Panaderia();
    ArrayList<Panaderia> lista_Panaderia = new ArrayList<>();

    public void create(Panaderia p1) {
        lista_Panaderia.add(p1);
    }

    public void update(int index, Panaderia p1, javax.swing.JTable panad_reg_tbl, javax.swing.JTable panad_reg_tbl1) {
        lista_Panaderia.set(index, p1);
        admintabla(panad_reg_tbl, lista_Panaderia);
        admintabla(panad_reg_tbl1, lista_Panaderia);
    }

    public Panaderia read(int index) {
        return lista_Panaderia.get(index);

    }
    public ArrayList<Panaderia> Read(String Filter) {
        ArrayList<Panaderia> Get = new ArrayList<>();
        for (Panaderia pan : lista_Panaderia) {
            if (pan.getNombre().contains(Filter)) {
                Get.add(pan);
            }
        }
        return Get;
    }
    

    public void delete(int index, javax.swing.JTable panad_reg_tbl, javax.swing.JTable panad_reg_tbl1) {
        lista_Panaderia.remove(index);
        admintabla(panad_reg_tbl,lista_Panaderia);
        admintabla(panad_reg_tbl1,lista_Panaderia);
    }

    public ArrayList<Panaderia> getLista_Panaderia() {
        return lista_Panaderia;
    }

    public void setLista_Panaderia(ArrayList<Panaderia> lista_Panaderia) {
        this.lista_Panaderia = lista_Panaderia;
    }

    public void admintabla(javax.swing.JTable panad_reg_tbl, ArrayList<Panaderia> panco) {
        Object[][] matriz = new Object[panco.size()][6];
        for (int i = 0; i < panco.size(); i++) {
            matriz[i][0] = panco.get(i).getNombre();
            matriz[i][1] = panco.get(i).getDireccion();
            matriz[i][2] = panco.get(i).getNit();
            matriz[i][3] = panco.get(i).getContacto();
            matriz[i][4] = panco.get(i).getNom_usuario();
            matriz[i][5] = panco.get(i).getPass_usuario();

        }       
        
        panad_reg_tbl.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Nombre", "Direccion", "NIT", "Contacto"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });        

        if (panad_reg_tbl.getColumnModel().getColumnCount() > 0) {
            panad_reg_tbl.getColumnModel().getColumn(0).setResizable(false);
            panad_reg_tbl.getColumnModel().getColumn(1).setResizable(false);
            panad_reg_tbl.getColumnModel().getColumn(2).setResizable(false);
            panad_reg_tbl.getColumnModel().getColumn(3).setResizable(false);
        }

    }
  
}
