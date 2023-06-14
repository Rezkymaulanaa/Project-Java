import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Produk;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class MainFrame extends javax.swing.JFrame {
    private int totalBelanja = 0;
    private List<Integer> selectedRowsList = new ArrayList<>();

    public MainFrame() {
        initComponents();
        tanggalNow();
        updateTable();
    }
    
    private void updateTable() {
        // Mendapatkan data dari database, misalnya dalam bentuk ArrayList<Produk> dengan menggunakan metode dari DbController
        List<Produk> produkList = DbController.getDatabase();

        // Menghapus data yang ada dalam tabel
        DefaultTableModel model = (DefaultTableModel) tableBarang.getModel();
        model.setRowCount(0);

        // Menambahkan data dari ArrayList<Produk> ke tabel
        for (Produk produk : produkList) {
            Object[] row = {produk.getId(), produk.getId(), produk.getNama(), produk.getHarga(), 0, produk.getjumlah()};
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navbar = new javax.swing.JPanel();
        labelToko = new javax.swing.JLabel();
        labelMiras = new javax.swing.JLabel();
        customerLabel = new javax.swing.JLabel();
        garis1 = new javax.swing.JLabel();
        labelTanggal = new javax.swing.JLabel();
        garis2 = new javax.swing.JLabel();
        cashierLabel = new javax.swing.JLabel();
        cashierName = new javax.swing.JLabel();
        tfCustomer = new javax.swing.JTextField();
        tfTanggal = new javax.swing.JTextField();
        navItem = new javax.swing.JPanel();
        tambahItemLabel = new javax.swing.JLabel();
        tambahButton = new javax.swing.JButton();
        insertButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        editNama = new javax.swing.JTextField();
        editStok = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        editId = new javax.swing.JTextField();
        editHarga = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        navTotal = new javax.swing.JPanel();
        totalAtas = new javax.swing.JLabel();
        labelTotalHarga = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tabelScroll = new javax.swing.JScrollPane();
        tableBarang = new javax.swing.JTable();
        exitButton = new javax.swing.JButton();
        panelTotalBawah = new javax.swing.JPanel();
        tunaiLabel = new javax.swing.JLabel();
        kembaliLabel = new javax.swing.JLabel();
        tfTunai = new javax.swing.JTextField();
        tfKembalian = new javax.swing.JTextField();
        bayarButton = new javax.swing.JButton();
        labelTidakCukup = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        navbar.setBackground(new java.awt.Color(51, 51, 51));

        labelToko.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        labelToko.setForeground(new java.awt.Color(247, 247, 247));
        labelToko.setText("TOKO");

        labelMiras.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        labelMiras.setForeground(new java.awt.Color(189, 36, 36));
        labelMiras.setText("MIRAS");

        customerLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        customerLabel.setForeground(new java.awt.Color(247, 247, 247));
        customerLabel.setText("Nama Customer");

        garis1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        garis1.setForeground(new java.awt.Color(247, 247, 247));
        garis1.setText("|");

        labelTanggal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTanggal.setForeground(new java.awt.Color(247, 247, 247));
        labelTanggal.setText("Tanggal");

        garis2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        garis2.setForeground(new java.awt.Color(247, 247, 247));
        garis2.setText("|");

        cashierLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cashierLabel.setForeground(new java.awt.Color(247, 247, 247));
        cashierLabel.setText("Cashier");

        cashierName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cashierName.setForeground(new java.awt.Color(247, 247, 247));
        cashierName.setText("Alif Rezky Maulana");
        cashierName.setEnabled(false);

        tfCustomer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfCustomer.setForeground(new java.awt.Color(51, 51, 51));
        tfCustomer.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tfTanggal.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        tfTanggal.setForeground(new java.awt.Color(51, 51, 51));
        tfTanggal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfTanggal.setEnabled(false);
        tfTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTanggalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelToko)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMiras)
                .addGap(27, 27, 27)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(customerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(garis1)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navbarLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(labelTanggal))
                    .addGroup(navbarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tfTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(garis2)
                .addGap(96, 96, 96)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cashierLabel)
                    .addComponent(cashierName))
                .addGap(15, 15, 15))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelToko, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMiras, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(navbarLayout.createSequentialGroup()
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(garis1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(garis2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(navbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cashierLabel)
                    .addComponent(labelTanggal)
                    .addComponent(customerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cashierName))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        navItem.setBackground(new java.awt.Color(255, 255, 255));

        tambahItemLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tambahItemLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tambahItemLabel.setText("    Pilih item dibawah lalu klik Add To Cart");

        tambahButton.setBackground(new java.awt.Color(189, 36, 36));
        tambahButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tambahButton.setForeground(new java.awt.Color(247, 247, 247));
        tambahButton.setText("Add To Cart");
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });

        insertButton.setBackground(new java.awt.Color(51, 51, 51));
        insertButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        insertButton.setForeground(new java.awt.Color(247, 247, 247));
        insertButton.setText("Insert");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(51, 51, 51));
        cancelButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(247, 247, 247));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        editStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStokActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama Baru");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Harga Baru");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Stok Baru");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("ID");

        editButton.setBackground(new java.awt.Color(51, 51, 51));
        editButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        editButton.setForeground(new java.awt.Color(247, 247, 247));
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deletebutton.setBackground(new java.awt.Color(51, 51, 51));
        deletebutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deletebutton.setForeground(new java.awt.Color(247, 247, 247));
        deletebutton.setText("Delete");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navItemLayout = new javax.swing.GroupLayout(navItem);
        navItem.setLayout(navItemLayout);
        navItemLayout.setHorizontalGroup(
            navItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(navItemLayout.createSequentialGroup()
                        .addGroup(navItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(navItemLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(navItemLayout.createSequentialGroup()
                                .addComponent(editId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editNama, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editStok, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(navItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(160, 160, 160))
                    .addGroup(navItemLayout.createSequentialGroup()
                        .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletebutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tambahButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(148, 148, 148))))
            .addGroup(navItemLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(tambahItemLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        navItemLayout.setVerticalGroup(
            navItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navItemLayout.createSequentialGroup()
                .addComponent(tambahItemLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(navItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(navItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(navItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahButton)
                    .addComponent(insertButton)
                    .addComponent(cancelButton)
                    .addComponent(editButton)
                    .addComponent(deletebutton))
                .addContainerGap())
        );

        navTotal.setBackground(new java.awt.Color(255, 255, 255));

        totalAtas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalAtas.setForeground(new java.awt.Color(189, 36, 36));
        totalAtas.setText("Total");

        labelTotalHarga.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTotalHarga.setForeground(new java.awt.Color(51, 51, 51));
        labelTotalHarga.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Rp.");

        javax.swing.GroupLayout navTotalLayout = new javax.swing.GroupLayout(navTotal);
        navTotal.setLayout(navTotalLayout);
        navTotalLayout.setHorizontalGroup(
            navTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navTotalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(totalAtas)
                .addContainerGap(370, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navTotalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        navTotalLayout.setVerticalGroup(
            navTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalAtas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(navTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );

        tableBarang.setBackground(new java.awt.Color(51, 51, 51));
        tableBarang.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        tableBarang.setForeground(new java.awt.Color(247, 247, 247));
        tableBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "ID Item", "Nama Item", "Stock", "Jumlah Barang", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelScroll.setViewportView(tableBarang);
        if (tableBarang.getColumnModel().getColumnCount() > 0) {
            tableBarang.getColumnModel().getColumn(0).setMaxWidth(45);
            tableBarang.getColumnModel().getColumn(1).setMaxWidth(60);
            tableBarang.getColumnModel().getColumn(3).setMaxWidth(45);
        }

        exitButton.setBackground(new java.awt.Color(247, 247, 247));
        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitButton.setForeground(new java.awt.Color(51, 51, 51));
        exitButton.setText("E X I T");
        exitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), null, null, new java.awt.Color(153, 153, 153)));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        panelTotalBawah.setBackground(new java.awt.Color(255, 255, 255));
        panelTotalBawah.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tunaiLabel.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        tunaiLabel.setForeground(new java.awt.Color(51, 51, 51));
        tunaiLabel.setText("TUNAI : Rp.");

        kembaliLabel.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        kembaliLabel.setForeground(new java.awt.Color(189, 36, 36));
        kembaliLabel.setText("KEMBALI : Rp.");

        tfTunai.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        tfTunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTunaiActionPerformed(evt);
            }
        });

        tfKembalian.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        tfKembalian.setEnabled(false);
        tfKembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKembalianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTotalBawahLayout = new javax.swing.GroupLayout(panelTotalBawah);
        panelTotalBawah.setLayout(panelTotalBawahLayout);
        panelTotalBawahLayout.setHorizontalGroup(
            panelTotalBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalBawahLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTotalBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tunaiLabel)
                    .addComponent(kembaliLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTotalBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfTunai, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(tfKembalian))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelTotalBawahLayout.setVerticalGroup(
            panelTotalBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalBawahLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTotalBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tunaiLabel)
                    .addComponent(tfTunai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelTotalBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kembaliLabel)
                    .addComponent(tfKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bayarButton.setBackground(new java.awt.Color(189, 36, 36));
        bayarButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bayarButton.setForeground(new java.awt.Color(247, 247, 247));
        bayarButton.setText("B A Y A R");
        bayarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bayarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarButtonActionPerformed(evt);
            }
        });

        labelTidakCukup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTidakCukup, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelTotalBawah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bayarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tabelScroll)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(navItem, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(navTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(navItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(navTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabelScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelTotalBawah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bayarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelTidakCukup, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        int pilih = JOptionPane.showConfirmDialog(null, "Keluar aplikasi?",
                "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
        if(pilih == JOptionPane.OK_OPTION){
            System.exit(0);
        } else {
            JOptionPane.getRootFrame();
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    
    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        int selectedRow = tableBarang.getSelectedRow();

        if (selectedRow != -1) {
            if (!selectedRowsList.contains(selectedRow)) {
                selectedRowsList.add(selectedRow);
            }

            int stockBarang = Integer.parseInt(tableBarang.getValueAt(selectedRow, 3).toString());

            if (stockBarang > 0) {
                double hargaBarang = Double.parseDouble(tableBarang.getValueAt(selectedRow, 5).toString());
                totalBelanja += hargaBarang;
                labelTotalHarga.setText(String.valueOf(totalBelanja));

                int jumlahBarang = Integer.parseInt(tableBarang.getValueAt(selectedRow, 4).toString());
                stockBarang--;
                jumlahBarang++;
                tableBarang.setValueAt(stockBarang, selectedRow, 3);
                tableBarang.setValueAt(jumlahBarang, selectedRow, 4);
            }
        }
    }//GEN-LAST:event_tambahButtonActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        String namaBaru = editNama.getText();
        String hargaBarustr = editHarga.getText();
        String stokBarustr = editStok.getText();
        
        long hargaBaru = Long.parseLong(hargaBarustr);
        int stokBaru = Integer.parseInt(stokBarustr);
        DbController.insertData(namaBaru, hargaBaru, stokBaru);
        
        editNama.setText("");
        editHarga.setText("");
        editStok.setText("");
        updateTable();
    }//GEN-LAST:event_insertButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        int selectedRow = tableBarang.getSelectedRow();

        if (selectedRow != -1) {
            int stockBarang = Integer.parseInt(tableBarang.getValueAt(selectedRow, 3).toString());
            int jumlahBarang = Integer.parseInt(tableBarang.getValueAt(selectedRow, 4).toString());
            if (jumlahBarang > 0) {
                double hargaBarang = Double.parseDouble(tableBarang.getValueAt(selectedRow, 5).toString());
                totalBelanja -= hargaBarang;
                labelTotalHarga.setText(String.valueOf(totalBelanja));
                
                stockBarang++;
                jumlahBarang--;
                tableBarang.setValueAt(stockBarang, selectedRow, 3);
                tableBarang.setValueAt(jumlahBarang, selectedRow, 4); 
            }   
        }
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void tfTunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTunaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTunaiActionPerformed

    private void tfKembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfKembalianActionPerformed

    private void bayarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableBarang.getModel();
        String uangStr = tfTunai.getText();
        String totalStr = labelTotalHarga.getText();
        int uang = Integer.parseInt(uangStr);
        int total = Integer.parseInt(totalStr);

        for (int selectedRow : selectedRowsList) {
            int id = (int) model.getValueAt(selectedRow, 0);
            int stockBarang = (int) model.getValueAt(selectedRow, 3);

            if (stockBarang >= 0) {
                if (uang >= total) {
                    DbController.updateJumlah(id, stockBarang);
                    labelTidakCukup.setText("");

                    int kembalian = uang - total;
                    String kembalianStr = String.valueOf(kembalian);
                    tfKembalian.setText(kembalianStr);
                    labelTidakCukup.setText("KEMBALIAN ANDA Rp. "+ tfKembalian.getText());


                    // Reset jumlah barang ke 0
                    model.setValueAt(0, selectedRow, 4);
                } else {
                    labelTidakCukup.setForeground(Color.red);
                    labelTidakCukup.setText("Uang anda tidak cukup");
                    updateTable();
                }
            }
        }

        // Reset total belanja ke 0
        totalBelanja = 0;
        labelTotalHarga.setText("0");
    }//GEN-LAST:event_bayarButtonActionPerformed

    private void tfTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTanggalActionPerformed

    }//GEN-LAST:event_tfTanggalActionPerformed

    private void editStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editStokActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        String target = editId.getText();
        String namaBaru = editNama.getText();
        String stokBarustr = editStok.getText();
        String hargaBarustr = editHarga.getText();
        
        long hargaBaru = Long.parseLong(hargaBarustr);
        int stokBaru = Integer.parseInt(stokBarustr);
        int targetint = Integer.parseInt(target);
        
        DbController.updateNama(targetint, namaBaru );
        DbController.updateJumlah(targetint, stokBaru);
        DbController.updateHarga(targetint, hargaBaru);
        
        editId.setText("");
        editNama.setText("");
        editStok.setText("");
        editHarga.setText("");
        
        updateTable();
    }//GEN-LAST:event_editButtonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        String target = editId.getText();
        
        int targetint = Integer.parseInt(target);
        DbController.deleteData(targetint);
       
        
        editId.setText("");
        updateTable();
    }//GEN-LAST:event_deletebuttonActionPerformed
    
    private void tanggalNow(){
                    // Mendapatkan tanggal saat ini
        LocalDate currentDate = LocalDate.now();

        // Format tanggal sesuai kebutuhan
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Mengubah tanggal menjadi string dalam format yang diinginkan
        String formattedDate = currentDate.format(dateFormatter);

        // Mengatur nilai tanggal ke field
        tfTanggal.setText(formattedDate);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bayarButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel cashierLabel;
    private javax.swing.JLabel cashierName;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JButton deletebutton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField editHarga;
    private javax.swing.JTextField editId;
    private javax.swing.JTextField editNama;
    private javax.swing.JTextField editStok;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel garis1;
    private javax.swing.JLabel garis2;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel kembaliLabel;
    private javax.swing.JLabel labelMiras;
    private javax.swing.JLabel labelTanggal;
    private javax.swing.JLabel labelTidakCukup;
    private javax.swing.JLabel labelToko;
    private javax.swing.JLabel labelTotalHarga;
    private javax.swing.JPanel navItem;
    private javax.swing.JPanel navTotal;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel panelTotalBawah;
    private javax.swing.JScrollPane tabelScroll;
    private javax.swing.JTable tableBarang;
    private javax.swing.JButton tambahButton;
    private javax.swing.JLabel tambahItemLabel;
    private javax.swing.JTextField tfCustomer;
    private javax.swing.JTextField tfKembalian;
    private javax.swing.JTextField tfTanggal;
    private javax.swing.JTextField tfTunai;
    private javax.swing.JLabel totalAtas;
    private javax.swing.JLabel tunaiLabel;
    // End of variables declaration//GEN-END:variables
}
