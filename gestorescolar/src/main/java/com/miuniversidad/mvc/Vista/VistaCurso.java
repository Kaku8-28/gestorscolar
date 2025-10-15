package com.miuniversidad.mvc.Vista;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VistaCurso extends JFrame {
    public JButton botonCargar = new JButton("Cargar Cursos");
    public JTextArea areaTexto = new JTextArea();

    public VistaCurso() {
        setTitle("Gestión de Cursos");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(botonCargar, BorderLayout.NORTH);
        add(new JScrollPane(areaTexto), BorderLayout.CENTER);
    }
}
