
package Vista;

import Controlador.Controlador;
import Controlador.ControladorImpl;
import Controlador.Objetos.domain.Alumno;
import Controlador.Objetos.domain.Asignatura;
import Controlador.Objetos.domain.Direccion;
import Controlador.Objetos.domain.Profesor;
//import Controlador.ControladorImpl;
//import Modelo.AlumnoVO;
import Modelo.Modelo;
import Modelo.ModeloImpl;
//import Modelo.ModeloImpl;
import Vista.Vista;
//import Vista.VistaImpl;
import java.awt.FlowLayout;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.text.SimplDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;

/**
 *
 * @author munchi
 */
public class GUI extends javax.swing.JFrame implements Vista {
    Controlador controlador;
    Modelo modelo = new ModeloImpl();
//    Vista vista = this;


    List<Profesor> profesores;
    ArrayList<Alumno> alumnos;
    List<Asignatura> asignaturas;
    ArrayList <JCheckBox> siglasCB;
    String dniAlumnoEncontrado;
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        controlador= new ControladorImpl(modelo, this);
        siglasCB= new ArrayList<> ();
        dniAlumnoEncontrado="";
        insertarButtom.setVisible(true);
        actualizarButtom.setVisible(false);
//       controlador.insertarObjetosCon();
        alumnos = (ArrayList<Alumno>) controlador.getAlumnosCon();
        asignaturas= controlador.getAsignaturas();
        profesores =controlador.getProfesores();
        mostrarAsignatura();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dniAlumnoTF = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        nombreTF = new javax.swing.JTextField();
        apellidosTF = new javax.swing.JTextField();
        nacimientoTF = new javax.swing.JTextField();
        telefonoTF = new javax.swing.JTextField();
        municipioTF = new javax.swing.JTextField();
        siglasPanel = new javax.swing.JPanel();
        actualizarButtom = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        calleTF = new javax.swing.JTextField();
        postalTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        portalTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        insertarButtom = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        siglasTF = new javax.swing.JTextField();
        unoCB = new javax.swing.JCheckBox();
        dosCB = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        alumnosLista = new javax.swing.JTextArea();
        siglasJ = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        asignaturasRB = new javax.swing.JRadioButton();
        alumnosRB = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaProfes = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        dniProfesorTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("D.N.I.");

        dniAlumnoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniAlumnoTFActionPerformed(evt);
            }
        });
        dniAlumnoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dniAlumnoTFKeyPressed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Alumno"));

        nombreTF.setText("Ej:Guzman");
        nombreTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTFActionPerformed(evt);
            }
        });

        apellidosTF.setText("Ej:Martinez");

        nacimientoTF.setText("dd-mm-yyyy");

        telefonoTF.setText("Nº1, Nº2..");

        municipioTF.setText("Municipio");

        siglasPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignaturas"));

        javax.swing.GroupLayout siglasPanelLayout = new javax.swing.GroupLayout(siglasPanel);
        siglasPanel.setLayout(siglasPanelLayout);
        siglasPanelLayout.setHorizontalGroup(
            siglasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        siglasPanelLayout.setVerticalGroup(
            siglasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        actualizarButtom.setText("Actualizar");
        actualizarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarButtomActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Fecha Nacimeinto:");

        jLabel5.setText("Telefonos:");

        jLabel6.setText("Publacion:");

        jLabel7.setText("Direccion:");

        calleTF.setText("Calle");

        postalTF.setText("C.P.");

        jLabel8.setText("Codigo Postal:");

        portalTF.setText("Numero");

        jLabel9.setText("Portal:");

        insertarButtom.setText("Insertar Alumno");
        insertarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarButtomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(siglasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(postalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(portalTF)
                            .addComponent(calleTF)
                            .addComponent(municipioTF)
                            .addComponent(telefonoTF)
                            .addComponent(nacimientoTF)
                            .addComponent(apellidosTF)
                            .addComponent(nombreTF, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(insertarButtom)
                .addGap(32, 32, 32)
                .addComponent(actualizarButtom)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidosTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nacimientoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(municipioTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(calleTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(portalTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postalTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(siglasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actualizarButtom)
                    .addComponent(insertarButtom))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(dniAlumnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(198, 198, 198))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dniAlumnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Estudiantes", jPanel1);

        siglasTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siglasTFActionPerformed(evt);
            }
        });
        siglasTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                siglasTFKeyPressed(evt);
            }
        });

        unoCB.setText("1º Curso");
        unoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoCBActionPerformed(evt);
            }
        });

        dosCB.setText("2º Curso");
        dosCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosCBActionPerformed(evt);
            }
        });

        alumnosLista.setColumns(20);
        alumnosLista.setRows(5);
        jScrollPane3.setViewportView(alumnosLista);

        siglasJ.setText("SIGLAS ASIGNATURA");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(unoCB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dosCB)
                        .addGap(70, 70, 70))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(siglasTF, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siglasJ))
                .addGap(0, 194, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(siglasJ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(siglasTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unoCB)
                    .addComponent(dosCB))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Alumnos", jPanel5);

        buttonGroup1.add(asignaturasRB);
        asignaturasRB.setText("Asignaturas");
        asignaturasRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignaturasRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(alumnosRB);
        alumnosRB.setText("Alumnos");
        alumnosRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnosRBActionPerformed(evt);
            }
        });

        listaProfes.setColumns(20);
        listaProfes.setRows(5);
        jScrollPane2.setViewportView(listaProfes);

        jLabel11.setText("DNI PROFESOR");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(asignaturasRB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alumnosRB)
                        .addGap(69, 69, 69))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dniProfesorTF))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel11)
                .addGap(1, 1, 1)
                .addComponent(dniProfesorTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asignaturasRB)
                    .addComponent(alumnosRB))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(358, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Profesores", jPanel6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jTabbedPane1.addTab("Consultas", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTFActionPerformed

    private void asignaturasRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignaturasRBActionPerformed
        for (Profesor dniProfesor : profesores) {
            if (dniProfesor.getDni().equals(dniProfesorTF.getText())){
                listarProfesores(dniProfesor.getDni());
                break;
            }
        }
    }//GEN-LAST:event_asignaturasRBActionPerformed

    private void alumnosRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnosRBActionPerformed
       for (Profesor dniProfesor : profesores) {
            if (dniProfesor.getDni().equals(dniProfesorTF.getText())){
                listarProfesores(dniProfesor.getDni());
                break;
            }
        }
    }//GEN-LAST:event_alumnosRBActionPerformed

    private void siglasTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_siglasTFKeyPressed
        for (Asignatura siglas : asignaturas) {
            if ((siglas.getAlias()).equals(siglasTF.getText())){
               listarAlumnos(siglas.getAlias());
                break;
            }
        }
    }//GEN-LAST:event_siglasTFKeyPressed

    private void unoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoCBActionPerformed
        listarAlumnos("ds");
        if(unoCB.isSelected() || dosCB.isSelected()){
            siglasTF.setVisible(false);
            siglasJ.setVisible(false);
        }else{
            siglasTF.setVisible(true);
            siglasJ.setVisible(true);
        }
    }//GEN-LAST:event_unoCBActionPerformed

    private void dosCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosCBActionPerformed
//         listarAlumnos("ds");
        if(unoCB.isSelected() || dosCB.isSelected()){
            siglasTF.setVisible(false);
            siglasJ.setVisible(false);
        }else{
            siglasTF.setVisible(true);
            siglasJ.setVisible(true);
        }
    }//GEN-LAST:event_dosCBActionPerformed

    private void dniAlumnoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniAlumnoTFActionPerformed
      cargarDatosAlumno(dniAlumnoTF.getText());

    }//GEN-LAST:event_dniAlumnoTFActionPerformed

    private void dniAlumnoTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniAlumnoTFKeyPressed
        cargarDatosAlumno(dniAlumnoTF.getText());
    }//GEN-LAST:event_dniAlumnoTFKeyPressed

    private void actualizarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarButtomActionPerformed
        controlador.updateAlumnoCon(recogerDatosFormulario());
        alumnos = (ArrayList<Alumno>) controlador.getAlumnosCon();
    }//GEN-LAST:event_actualizarButtomActionPerformed

    private void insertarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarButtomActionPerformed
        Alumno alumno = recogerDatosFormulario();
        alumno.setDni(dniAlumnoTF.getText());
        controlador.createAlumnoCon(alumno);
        alumnos = (ArrayList<Alumno>) controlador.getAlumnosCon();
    }//GEN-LAST:event_insertarButtomActionPerformed

    private void siglasTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siglasTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siglasTFActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarButtom;
    private javax.swing.JTextArea alumnosLista;
    private javax.swing.JRadioButton alumnosRB;
    private javax.swing.JTextField apellidosTF;
    private javax.swing.JRadioButton asignaturasRB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField calleTF;
    private javax.swing.JTextField dniAlumnoTF;
    private javax.swing.JTextField dniProfesorTF;
    private javax.swing.JCheckBox dosCB;
    private javax.swing.JButton insertarButtom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea listaProfes;
    private javax.swing.JTextField municipioTF;
    private javax.swing.JTextField nacimientoTF;
    private javax.swing.JTextField nombreTF;
    private javax.swing.JTextField portalTF;
    private javax.swing.JTextField postalTF;
    private javax.swing.JLabel siglasJ;
    private javax.swing.JPanel siglasPanel;
    private javax.swing.JTextField siglasTF;
    private javax.swing.JTextField telefonoTF;
    private javax.swing.JCheckBox unoCB;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrar() {
       this.setVisible(true);
       
    }
  
    public void listarProfesores(String dni){
        if (asignaturasRB.isSelected()){
            mostrarResultadoProfesores(controlador.AsignaturasProfesorCon(dni));    
        }
        if(alumnosRB.isSelected()){
           mostrarResultadoProfeso(controlador.AlumnosProfesorCon(dni));    
        }
        
    }
    public void mostrarResultadoProfesores(List<Asignatura> resultados){
        String cadena="";
        for (Asignatura resultado : resultados) {
            cadena += resultado.toString()+"\n";

        }
                    listaProfes.setText(cadena);
    }
    public void mostrarResultadoProfeso(List<Alumno> resultados){
        String cadena="";
        for (Alumno resultado : resultados) {
            cadena += resultado.toString()+"\n";

        }
                    listaProfes.setText(cadena);
    }
    public void mostrarResultadoAlumnos(List<Alumno> resultados){
        String cadena="";
        for (Alumno resultado : resultados) {
            cadena += resultado.toString()+"\n";

        }
                    alumnosLista.setText(cadena);
    }

    private void listarAlumnos(String siglas) {
        if (!unoCB.isSelected() && !dosCB.isSelected()){
        mostrarResultadoAlumnos(controlador.mostrarAlumnosDeAsignatura(siglas));    
        }else if(unoCB.isSelected() && dosCB.isSelected()){
            mostrarResultadoAlumnos(controlador.cursoAsignaturaCon(0));    
        }else if(unoCB.isSelected()){
            mostrarResultadoAlumnos(controlador.cursoAsignaturaCon(1));    
        }else if(dosCB.isSelected()){
            mostrarResultadoAlumnos(controlador.cursoAsignaturaCon(2));

            
        }
    }
    public void cargarDatosAlumno(String dni){
        dniAlumnoEncontrado=dni;
//        AlumnoVO alumno = new AlumnoVO();
        System.out.println("holii");
        for (Alumno alu : alumnos) {
            if(dni.equals(alu.getDni())){
                insertarButtom.setVisible(false);
                actualizarButtom.setVisible(true);
                mostratDatosAlumno(alu);
                break;
            }else{
                for (JCheckBox siglaCB : siglasCB) {
                    siglaCB.setSelected(false);
                    siglaCB.setEnabled(true);
                }
                insertarButtom.setVisible(true);
                actualizarButtom.setVisible(false);
            }
        }
        
    }
/////-------------------------------------------///
    private void mostratDatosAlumno(Alumno alumno) {
        nombreTF.setText(alumno.getNombre());
        apellidosTF.setText(alumno.getApellido());
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        String fechaComoCadena = formatoFecha.format(alumno.getFecha_nacimiento());
        nacimientoTF.setText(fechaComoCadena);
        List<Integer> tel = alumno.getTelefonos();
        String telefonos="";
        for (Integer te : tel) {
            telefonos += te+",";
        }
        
       telefonoTF.setText(telefonos);
        Direccion direccion = alumno.getDireccion();
        municipioTF.setText(direccion.getCiudad());
        calleTF.setText(direccion.getCalle());
        portalTF.setText(String.valueOf(direccion.getNumero()));

        for (JCheckBox siglas : siglasCB) {
            for (Asignatura asignatura: alumno.getAsignaturas()) {
                if ((siglas.getText()).equals(asignatura.getAlias())) {
                    siglas.setSelected(true);
                    siglas.setEnabled(false);
                }else{
                    siglas.setSelected(false); 
                }
            }
        }
        
    }
    
    public Alumno recogerDatosFormulario(){
        Alumno alumno = new Alumno();
        alumno.setNombre(nombreTF.getText());
        alumno.setApellido(apellidosTF.getText());
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        try {
            java.util.Date utilDate = formatoFecha.parse(nacimientoTF.getText());
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
//            Date fecha=(Date) formatoFecha.parse(nacimientoTF.getText());
            alumno.setFecha_nacimiento(sqlDate);
        } catch (ParseException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String[] tel = (telefonoTF.getText()).split(",");
        List<Integer> telefonos = new ArrayList<>();
        for (String te : tel) {
//            alumno.addTelefono(Integer.parseInt(te));
            telefonos.add(Integer.parseInt(te));
            
        }
        alumno.setTelefonos(telefonos);
        Direccion direccion = new Direccion(municipioTF.getText(),calleTF.getText(),Integer.parseInt (portalTF.getText()));
        alumno.setDireccion(direccion);
        
        ArrayList<String> seMatricula = new ArrayList<>();
        List<Asignatura> matriculado = new ArrayList<>();
        for (JCheckBox siglas : siglasCB) {
            if(siglas.isSelected() || !siglas.isEnabled())
                for (Asignatura asignatura : asignaturas) {
                    if((siglas.getText()).equals(asignatura.getAlias()))
                        matriculado.add(asignatura);
                }
        }
        alumno.setAsignaturas(matriculado);
        alumno.setDni(dniAlumnoEncontrado);
        
       return alumno; 
        
    }
    
    public void mostrarAsignatura(){
        for (Asignatura siglas : asignaturas) {
            siglasCB.add(new JCheckBox(siglas.getAlias()));
            
        }
        siglasPanel.setLayout(new FlowLayout());
        for (JCheckBox CB : siglasCB) {
            
            siglasPanel.add(CB);
            CB.setVisible(true);
            this.pack();
        }
    }
//    

}
