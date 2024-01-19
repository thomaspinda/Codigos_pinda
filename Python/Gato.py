import PyQt5.QtWidgets as qtw
import PyQt5.QtGui as qtg


class MainWindow(qtw.QWidget):
    def __init__(self):
        super().__init__()

        self.setWindowTitle("GATO ##")        
        # Crear un diseño vertical
        layout_vertical = qtw.QVBoxLayout()

        # Primer botón
        boton1 = qtw.QPushButton("Botón 1")
        layout_vertical.addWidget(boton1)

        # Crear un diseño horizontal
        layout_horizontal = qtw.QHBoxLayout()

        # Segundo botón
        boton2 = qtw.QPushButton("Botón 2")
        layout_horizontal.addWidget(boton2)

        # Tercer botón
        boton3 = qtw.QPushButton("Botón 3")
        layout_vertical.addWidget(boton3)

        # Añadir el diseño horizontal al diseño vertical
        layout_vertical.addLayout(layout_horizontal)

        # Establecer el diseño principal de la ventana
        self.setLayout(layout_vertical)

        self.resize(300,400)
        self.show()

        def hola():
            print("Hola Bart")
if __name__ == "__main__":
    app = qtw.QApplication([])
    ventana = MainWindow()

    app.exec_()