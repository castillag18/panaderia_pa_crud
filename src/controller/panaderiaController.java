package controller;

import controller.panaderiaController;
import model.panaderia;
import java.util.ArrayList;

public class panaderiaController {

    panaderia p1 = new panaderia();
    ArrayList<panaderia> lista_panaderia = new ArrayList<>();

    public void create(panaderia p1) {
        lista_panaderia.add(p1);
    }

    public void update(int index, panaderia p1, javax.swing.JTable panad_reg_tbl, javax.swing.JTable panad_reg_tbl1) {
        lista_panaderia.set(index, p1);
        admintabla(panad_reg_tbl, lista_panaderia);
        admintabla(panad_reg_tbl1, lista_panaderia);
    }

    public panaderia read(int index) {
        return lista_panaderia.get(index);

    }
    public ArrayList<panaderia> Read(String Filter) {
        ArrayList<panaderia> Get = new ArrayList<>();
        for (panaderia pan : lista_panaderia) {
            if (pan.getNombre().contains(Filter)) {
                Get.add(pan);
            }
        }
        return Get;
    }
    

    public void delete(int index, javax.swing.JTable panad_reg_tbl, javax.swing.JTable panad_reg_tbl1) {
        lista_panaderia.remove(index);
        admintabla(panad_reg_tbl,lista_panaderia);
        admintabla(panad_reg_tbl1,lista_panaderia);
    }

    public ArrayList<panaderia> getLista_panaderia() {
        return lista_panaderia;
    }

    public void setLista_panaderia(ArrayList<panaderia> lista_panaderia) {
        this.lista_panaderia = lista_panaderia;
    }

    public void admintabla(javax.swing.JTable panad_reg_tbl, ArrayList<panaderia> panco) {
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
