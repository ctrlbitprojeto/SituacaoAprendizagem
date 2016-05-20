package SituacaoAprendizagem;

public class telaInicial extends javax.swing.JFrame {
    
    //Todos os arrays---------------------------------------------------
    //Dia do 1° jogo
    int setorAmareloD1[][] = new int[25][200];
    int setorAzulD1[][] = new int[25][200];
    int setorBrancoD1[][] = new int[25][200];
    int setorVerdeD1[][] = new int[25][200];
    //Dia do 2° jogo
    int setorAmareloD2[][] = new int[25][200];
    int setorAzulD2[][] = new int[25][200];
    int setorBrancoD2[][] = new int[25][200];
    int setorVerdeD2[][] = new int[25][200];
    //--------------------------------------------------------------------

    //Booleans para afirmações--------------------------------------------
    boolean disponibilidade = false;
    //--------------------------------------------------------------------

    public telaInicial() {
       
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        painelPrincipal = new javax.swing.JPanel();
        painelCompra = new javax.swing.JPanel();
        layoutInutil = new javax.swing.JLabel();
        txtValorIngresso = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        painelLugar = new javax.swing.JPanel();
        layoutInutil2 = new javax.swing.JLabel();
        layoutInutil3 = new javax.swing.JLabel();
        caixaFileira = new javax.swing.JTextField();
        caixaCadeira = new javax.swing.JTextField();
        comboSetor = new javax.swing.JComboBox();
        btnConsultarDisponibilidade = new javax.swing.JButton();
        txtDisponibilidadeSN = new javax.swing.JLabel();
        painelDias = new javax.swing.JPanel();
        radioPrimeiroDia = new javax.swing.JRadioButton();
        radioSegundoDia = new javax.swing.JRadioButton();
        painelSugestao = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        caixaTxtProxima = new javax.swing.JTextArea();
        layoutInutil4 = new javax.swing.JLabel();
        btnBuscarMaisProximo = new javax.swing.JButton();
        painelLotacao = new javax.swing.JPanel();
        layoutInutil5 = new javax.swing.JLabel();
        layoutInutil6 = new javax.swing.JLabel();
        layoutInutil7 = new javax.swing.JLabel();
        layoutInutil8 = new javax.swing.JLabel();
        progresAmarelo = new javax.swing.JProgressBar();
        progresAzul = new javax.swing.JProgressBar();
        progresBranco = new javax.swing.JProgressBar();
        progresVerde = new javax.swing.JProgressBar();
        painelArrecadacaoDoisJogos = new javax.swing.JPanel();
        layoutInutil10 = new javax.swing.JLabel();
        layoutInutil12 = new javax.swing.JLabel();
        txtTotalArrecadado = new javax.swing.JLabel();
        txtIngressosVendidos = new javax.swing.JLabel();
        painelPrimeiroJogo = new javax.swing.JPanel();
        layoutInutil13 = new javax.swing.JLabel();
        layoutInutil14 = new javax.swing.JLabel();
        txtPrimeiroJogoArrecadado = new javax.swing.JLabel();
        txtIngressosVendidosPrimeiroJogo = new javax.swing.JLabel();
        painelSegundoJogo = new javax.swing.JPanel();
        layoutInutil15 = new javax.swing.JLabel();
        layoutInutil16 = new javax.swing.JLabel();
        txtSegundoJogoArrecadado = new javax.swing.JLabel();
        txtIngressosVendidosSegundoJogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(0, 0));
        setResizable(false);

        painelPrincipal.setOpaque(false);

        painelCompra.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Compra"));

        layoutInutil.setText("Valor do ingresso:");

        txtValorIngresso.setText("R$ Valor");

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCompraLayout = new javax.swing.GroupLayout(painelCompra);
        painelCompra.setLayout(painelCompraLayout);
        painelCompraLayout.setHorizontalGroup(
            painelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelCompraLayout.createSequentialGroup()
                        .addComponent(layoutInutil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValorIngresso, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelCompraLayout.setVerticalGroup(
            painelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(layoutInutil)
                    .addComponent(txtValorIngresso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnComprar)
                .addContainerGap())
        );

        painelLugar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Lugar"));

        layoutInutil2.setText("Cadeira");
        layoutInutil2.setOpaque(true);

        layoutInutil3.setText("Fileira");
        layoutInutil3.setOpaque(true);

        comboSetor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Setor", "Amarelo", "Azul", "Branco", "Verde" }));

        btnConsultarDisponibilidade.setText("Consultar Disponibilidade");
        btnConsultarDisponibilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarDisponibilidadeActionPerformed(evt);
            }
        });

        txtDisponibilidadeSN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout painelLugarLayout = new javax.swing.GroupLayout(painelLugar);
        painelLugar.setLayout(painelLugarLayout);
        painelLugarLayout.setHorizontalGroup(
            painelLugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLugarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLugarLayout.createSequentialGroup()
                        .addComponent(layoutInutil2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(caixaCadeira, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultarDisponibilidade))
                    .addGroup(painelLugarLayout.createSequentialGroup()
                        .addGroup(painelLugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(comboSetor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelLugarLayout.createSequentialGroup()
                                .addComponent(layoutInutil3)
                                .addGap(18, 18, 18)
                                .addComponent(caixaFileira, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(txtDisponibilidadeSN, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelLugarLayout.setVerticalGroup(
            painelLugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLugarLayout.createSequentialGroup()
                .addGroup(painelLugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelLugarLayout.createSequentialGroup()
                        .addComponent(comboSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelLugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(layoutInutil3)
                            .addComponent(caixaFileira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtDisponibilidadeSN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(painelLugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaCadeira, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(layoutInutil2)
                    .addComponent(btnConsultarDisponibilidade))
                .addContainerGap())
        );

        painelDias.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dias"));

        buttonGroup1.add(radioPrimeiroDia);
        radioPrimeiroDia.setText("Primeiro Dia");

        buttonGroup1.add(radioSegundoDia);
        radioSegundoDia.setText("Segundo Dia");

        javax.swing.GroupLayout painelDiasLayout = new javax.swing.GroupLayout(painelDias);
        painelDias.setLayout(painelDiasLayout);
        painelDiasLayout.setHorizontalGroup(
            painelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDiasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioSegundoDia)
                    .addComponent(radioPrimeiroDia))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        painelDiasLayout.setVerticalGroup(
            painelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDiasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioPrimeiroDia)
                .addGap(18, 18, 18)
                .addComponent(radioSegundoDia)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        painelSugestao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Sugestão"));

        caixaTxtProxima.setEditable(false);
        caixaTxtProxima.setColumns(20);
        caixaTxtProxima.setRows(5);
        caixaTxtProxima.setText("Fileira X Cadeira X\nFileira Y Cadeira X");
        jScrollPane1.setViewportView(caixaTxtProxima);

        layoutInutil4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        layoutInutil4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        layoutInutil4.setText("Cadeira Mais Próxima do Gramado :");

        btnBuscarMaisProximo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnBuscarMaisProximo.setText("Buscar");

        javax.swing.GroupLayout painelSugestaoLayout = new javax.swing.GroupLayout(painelSugestao);
        painelSugestao.setLayout(painelSugestaoLayout);
        painelSugestaoLayout.setHorizontalGroup(
            painelSugestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSugestaoLayout.createSequentialGroup()
                .addGroup(painelSugestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSugestaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(layoutInutil4))
                    .addGroup(painelSugestaoLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnBuscarMaisProximo)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelSugestaoLayout.setVerticalGroup(
            painelSugestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSugestaoLayout.createSequentialGroup()
                .addGroup(painelSugestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSugestaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(layoutInutil4)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarMaisProximo))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelLotacao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Lotação"));

        layoutInutil5.setText("Setor Amarelo");

        layoutInutil6.setText("Setor Azul");

        layoutInutil7.setText("Setor Branco");

        layoutInutil8.setText("Setor Verde");

        progresAmarelo.setForeground(new java.awt.Color(255, 204, 51));
        progresAmarelo.setStringPainted(true);

        progresAzul.setStringPainted(true);

        progresBranco.setForeground(new java.awt.Color(255, 255, 255));
        progresBranco.setStringPainted(true);

        progresVerde.setStringPainted(true);

        javax.swing.GroupLayout painelLotacaoLayout = new javax.swing.GroupLayout(painelLotacao);
        painelLotacao.setLayout(painelLotacaoLayout);
        painelLotacaoLayout.setHorizontalGroup(
            painelLotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLotacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLotacaoLayout.createSequentialGroup()
                        .addComponent(layoutInutil5)
                        .addGap(18, 18, 18)
                        .addComponent(progresAmarelo, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE))
                    .addGroup(painelLotacaoLayout.createSequentialGroup()
                        .addGroup(painelLotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(layoutInutil7)
                            .addComponent(layoutInutil8)
                            .addComponent(layoutInutil6))
                        .addGap(24, 24, 24)
                        .addGroup(painelLotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(progresAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(progresBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(progresVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        painelLotacaoLayout.setVerticalGroup(
            painelLotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLotacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(layoutInutil5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(progresAmarelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(painelLotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(progresAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(layoutInutil6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(painelLotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(progresBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(layoutInutil7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(painelLotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(layoutInutil8)
                    .addComponent(progresVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelArrecadacaoDoisJogos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Total de arrecadação dos dois jogos"));

        layoutInutil10.setText("Total arrecadado: ");

        layoutInutil12.setText("Ingressos vendidos: ");

        txtTotalArrecadado.setText("RS Valor");

        txtIngressosVendidos.setText("Número Total");

        javax.swing.GroupLayout painelArrecadacaoDoisJogosLayout = new javax.swing.GroupLayout(painelArrecadacaoDoisJogos);
        painelArrecadacaoDoisJogos.setLayout(painelArrecadacaoDoisJogosLayout);
        painelArrecadacaoDoisJogosLayout.setHorizontalGroup(
            painelArrecadacaoDoisJogosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelArrecadacaoDoisJogosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelArrecadacaoDoisJogosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(layoutInutil12)
                    .addComponent(layoutInutil10))
                .addGap(18, 18, 18)
                .addGroup(painelArrecadacaoDoisJogosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotalArrecadado)
                    .addComponent(txtIngressosVendidos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelArrecadacaoDoisJogosLayout.setVerticalGroup(
            painelArrecadacaoDoisJogosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelArrecadacaoDoisJogosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelArrecadacaoDoisJogosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(layoutInutil10)
                    .addComponent(txtTotalArrecadado))
                .addGap(18, 18, 18)
                .addGroup(painelArrecadacaoDoisJogosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(layoutInutil12)
                    .addComponent(txtIngressosVendidos))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        painelPrimeiroJogo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Primeiro jogo"));

        layoutInutil13.setText("Total arrecadado: ");

        layoutInutil14.setText("Ingressos vendidos: ");

        txtPrimeiroJogoArrecadado.setText("RS Valor");

        txtIngressosVendidosPrimeiroJogo.setText("Número Total");

        javax.swing.GroupLayout painelPrimeiroJogoLayout = new javax.swing.GroupLayout(painelPrimeiroJogo);
        painelPrimeiroJogo.setLayout(painelPrimeiroJogoLayout);
        painelPrimeiroJogoLayout.setHorizontalGroup(
            painelPrimeiroJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrimeiroJogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrimeiroJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(layoutInutil14)
                    .addComponent(layoutInutil13))
                .addGap(18, 18, 18)
                .addGroup(painelPrimeiroJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrimeiroJogoArrecadado)
                    .addComponent(txtIngressosVendidosPrimeiroJogo))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        painelPrimeiroJogoLayout.setVerticalGroup(
            painelPrimeiroJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrimeiroJogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrimeiroJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(layoutInutil13)
                    .addComponent(txtPrimeiroJogoArrecadado))
                .addGap(18, 18, 18)
                .addGroup(painelPrimeiroJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(layoutInutil14)
                    .addComponent(txtIngressosVendidosPrimeiroJogo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelSegundoJogo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Segundo jogo"));

        layoutInutil15.setText("Total arrecadado: ");

        layoutInutil16.setText("Ingressos vendidos: ");

        txtSegundoJogoArrecadado.setText("RS Valor");

        txtIngressosVendidosSegundoJogo.setText("Número Total");

        javax.swing.GroupLayout painelSegundoJogoLayout = new javax.swing.GroupLayout(painelSegundoJogo);
        painelSegundoJogo.setLayout(painelSegundoJogoLayout);
        painelSegundoJogoLayout.setHorizontalGroup(
            painelSegundoJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSegundoJogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSegundoJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(layoutInutil16)
                    .addComponent(layoutInutil15))
                .addGap(18, 18, 18)
                .addGroup(painelSegundoJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSegundoJogoArrecadado)
                    .addComponent(txtIngressosVendidosSegundoJogo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelSegundoJogoLayout.setVerticalGroup(
            painelSegundoJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSegundoJogoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(painelSegundoJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(layoutInutil15)
                    .addComponent(txtSegundoJogoArrecadado))
                .addGap(18, 18, 18)
                .addGroup(painelSegundoJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIngressosVendidosSegundoJogo)
                    .addComponent(layoutInutil16))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 919, Short.MAX_VALUE)
            .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelPrincipalLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(painelLotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelSugestao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelPrincipalLayout.createSequentialGroup()
                            .addComponent(painelDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(painelLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(painelCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGap(18, 18, 18)
                    .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(painelPrimeiroJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelArrecadacaoDoisJogos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelSegundoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
            .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelPrincipalLayout.createSequentialGroup()
                    .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelPrincipalLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(painelDias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(painelCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(painelLugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(painelArrecadacaoDoisJogos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(painelSugestao, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(painelPrimeiroJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(painelSegundoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelLotacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarDisponibilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarDisponibilidadeActionPerformed

        txtValorIngresso.setText("");
        
        consultandoDisponibilidade();

        if (disponibilidade == true) {

            if (radioPrimeiroDia.isSelected() == true) {

                verificarDisponibilidadeDia1();

            } else {

                verificarDisponibilidadeDia2();

            }

        }

    }//GEN-LAST:event_btnConsultarDisponibilidadeActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        
        if(txtDisponibilidadeSN.getText()=="Disponível"){
            comprandoIngressso();
        }

        txtValorIngresso.setText("");
        caixaCadeira.setText("");
        caixaFileira.setText("");
        comboSetor.setSelectedItem("Setor");
        txtDisponibilidadeSN.setText("");
        
    }//GEN-LAST:event_btnComprarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarMaisProximo;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnConsultarDisponibilidade;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField caixaCadeira;
    private javax.swing.JTextField caixaFileira;
    private javax.swing.JTextArea caixaTxtProxima;
    private javax.swing.JComboBox comboSetor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel layoutInutil;
    private javax.swing.JLabel layoutInutil10;
    private javax.swing.JLabel layoutInutil12;
    private javax.swing.JLabel layoutInutil13;
    private javax.swing.JLabel layoutInutil14;
    private javax.swing.JLabel layoutInutil15;
    private javax.swing.JLabel layoutInutil16;
    private javax.swing.JLabel layoutInutil2;
    private javax.swing.JLabel layoutInutil3;
    private javax.swing.JLabel layoutInutil4;
    private javax.swing.JLabel layoutInutil5;
    private javax.swing.JLabel layoutInutil6;
    private javax.swing.JLabel layoutInutil7;
    private javax.swing.JLabel layoutInutil8;
    private javax.swing.JPanel painelArrecadacaoDoisJogos;
    private javax.swing.JPanel painelCompra;
    private javax.swing.JPanel painelDias;
    private javax.swing.JPanel painelLotacao;
    private javax.swing.JPanel painelLugar;
    private javax.swing.JPanel painelPrimeiroJogo;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelSegundoJogo;
    private javax.swing.JPanel painelSugestao;
    private javax.swing.JProgressBar progresAmarelo;
    private javax.swing.JProgressBar progresAzul;
    private javax.swing.JProgressBar progresBranco;
    private javax.swing.JProgressBar progresVerde;
    private javax.swing.JRadioButton radioPrimeiroDia;
    private javax.swing.JRadioButton radioSegundoDia;
    private javax.swing.JLabel txtDisponibilidadeSN;
    private javax.swing.JLabel txtIngressosVendidos;
    private javax.swing.JLabel txtIngressosVendidosPrimeiroJogo;
    private javax.swing.JLabel txtIngressosVendidosSegundoJogo;
    private javax.swing.JLabel txtPrimeiroJogoArrecadado;
    private javax.swing.JLabel txtSegundoJogoArrecadado;
    private javax.swing.JLabel txtTotalArrecadado;
    private javax.swing.JLabel txtValorIngresso;
    // End of variables declaration//GEN-END:variables

    // Método verifica se todos os campos são válidos -----------
    public void consultandoDisponibilidade() {
       
        if (caixaCadeira.getText().isEmpty()) {
            txtDisponibilidadeSN.setText("Especifique a Cadeira");
            disponibilidade = false;
        } else if (caixaFileira.getText().isEmpty()) {
            txtDisponibilidadeSN.setText("Especifique a Fileira");
            disponibilidade = false;
        } else if (comboSetor.getSelectedItem() == "Setor") {
            txtDisponibilidadeSN.setText("Especifique o Setor");
            disponibilidade = false;
        } else if (radioPrimeiroDia.isSelected() == false && radioSegundoDia.isSelected() == false) {
            txtDisponibilidadeSN.setText("Especifique o Dia");
            disponibilidade = false;
        } else if (Integer.parseInt(caixaCadeira.getText())>= 201||Integer.parseInt(caixaCadeira.getText())<=0) {
            txtDisponibilidadeSN.setText("Cadeira não existe");
        } else if (Integer.parseInt(caixaFileira.getText())>= 26||Integer.parseInt(caixaFileira.getText())<=0) {
            txtDisponibilidadeSN.setText("Fileira não existe");
        } else {
            disponibilidade = true;
        }
    }

    private void verificarDisponibilidadeDia1() {

        //Conversão de valores -----------------------------------------------
        int cadeira = Integer.parseInt(caixaCadeira.getText());
        int fileira = Integer.parseInt(caixaFileira.getText());
        //--------------------------------------------------------------------
        
        // SETOR AMARELO -----------------------------------------------------
        if (comboSetor.getSelectedItem() == "Amarelo") {

            if (setorAmareloD1[fileira][cadeira] != 1) {
                txtDisponibilidadeSN.setText("Disponível");
                txtValorIngresso.setText("R$ 25,00");
            } else {
                txtDisponibilidadeSN.setText("Ocupado");
            }

        } // SETOR AZUL ---------------------------------------
        else if (comboSetor.getSelectedItem() == "Azul") {

            if (setorAzulD1[fileira][cadeira] != 1) {
                txtDisponibilidadeSN.setText("Disponível");
            } else {
                txtDisponibilidadeSN.setText("Ocupado");
            }

        } // SETOR BRANCO ---------------------------------------
        else if (comboSetor.getSelectedItem() == "Branco") {

            if (setorBrancoD1[fileira][cadeira] != 1) {
                txtDisponibilidadeSN.setText("Disponível");
            } else {
                txtDisponibilidadeSN.setText("Ocupado");
            }

        } // SETOR VERDE ----------------------------------------
        else if (comboSetor.getSelectedItem() == "Verde") {

            if (setorVerdeD1[fileira][cadeira] != 1) {
                txtDisponibilidadeSN.setText("Disponível");
            } else {
                txtDisponibilidadeSN.setText("Ocupado");
            }

        }
            //-----------------------------------------------------------------------

    }

    private void verificarDisponibilidadeDia2() {

        //Conversão de valores -----------------------------------------------
        int fileira = Integer.parseInt(caixaCadeira.getText());
        int cadeira = Integer.parseInt(caixaFileira.getText());
        //--------------------------------------------------------------------

        // SETOR AMARELO -----------------------------------------------------
        if (comboSetor.getSelectedItem() == "Amarelo") {

            if (setorAmareloD2[fileira][cadeira] != 1) {
                txtDisponibilidadeSN.setText("Disponível");
            } else {
                txtDisponibilidadeSN.setText("Ocupado");
            }

        } // SETOR AZUL ---------------------------------------
        else if (comboSetor.getSelectedItem() == "Azul") {

            if (setorAzulD2[fileira][cadeira] != 1) {
                txtDisponibilidadeSN.setText("Disponível");
            } else {
                txtDisponibilidadeSN.setText("Ocupado");
            }

        } // SETOR BRANCO ---------------------------------------
        else if (comboSetor.getSelectedItem() == "Branco") {

            if (setorBrancoD2[fileira][cadeira] != 1) {
                txtDisponibilidadeSN.setText("Disponível");
            } else {
                txtDisponibilidadeSN.setText("Ocupado");
            }

        } // SETOR VERDE ----------------------------------------
        else if (comboSetor.getSelectedItem() == "Verde") {

            if (setorVerdeD2[fileira][cadeira] != 1) {
                txtDisponibilidadeSN.setText("Disponível");
            } else {
                txtDisponibilidadeSN.setText("Ocupado");
            }

        }
        //-----------------------------------------------------------------------

    }

    private void comprandoIngressso() {
        
        int cadeira = Integer.parseInt(caixaCadeira.getText());
        int fileira = Integer.parseInt(caixaFileira.getText());
        
        if(radioPrimeiroDia.isSelected()== true){
            
            if(comboSetor.getSelectedItem() == "Amarelo"){
                setorAmareloD1[fileira][cadeira] = 1;
            } else if(comboSetor.getSelectedItem() == "Azul"){
                setorAzulD1[fileira][cadeira] = 1;
            } else if(comboSetor.getSelectedItem() == "Branco"){
                setorBrancoD1[fileira][cadeira] = 1;
            } else if(comboSetor.getSelectedItem() == "Verde"){
                setorVerdeD1[fileira][cadeira] = 1;
            }
                
        }else if (radioSegundoDia.isSelected()==true){
            if(comboSetor.getSelectedItem() == "Amarelo"){
                setorAmareloD2[fileira][cadeira] = 1;
            } else if(comboSetor.getSelectedItem() == "Azul"){
                setorAzulD2[fileira][cadeira] = 1;
            } else if(comboSetor.getSelectedItem() == "Branco"){
                setorBrancoD2[fileira][cadeira] = 1;
            } else if(comboSetor.getSelectedItem() == "Verde"){
                setorVerdeD2[fileira][cadeira] = 1;
            }
        }
        
    }

}
