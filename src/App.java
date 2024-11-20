public class App {

    public static void main(String[] args){
        System.out.println("Informações do produto \n");

        Produto produto = new Produto();

        produto.setCodigo(123);
        produto.setNome("iPhone 16");
        produto.setDescricao("O Apple iPhone 16 é um smartphone iOS com características inovadoras que o tornam uma excelente opção para qualquer tipo de utilização, representando um dos melhores dispositivos móveis já feitos. A tela de 6.1 polegadas coloca esse Apple no topo de sua categoria. A resolução também é alta: 2556x1179 pixel. As funcionalidades oferecidas pelo Apple iPhone 16 são muitas e todas top de linha. Começando pelo 5G que permite a transferência de dados e excelente navegação na internet, além de conectividade Wi-fi e GPS presente no aparelho. Tem também leitor multimídia, videoconferência, e bluetooth. Enfatizamos a excelente memória interna de 512 GB mas sem a possibilidade de expansão. A excelência deste Apple iPhone 16 é completada por uma câmera de 48 megapixels que permite tirar fotos fantásticas com uma resolução de 8000x6000 pixels e gravar vídeos em 4K a espantosa resolução de 3840x2160 pixels. A espessura de apenas 7.8 milímetros torna o Apple iPhone 16 um dos telefones mais finos que existem.");
        produto.setAplicacao("Smartphone");
        produto.setPreco(8.599);

        produto.setAltura(147.6);
        produto.setLargura(71.6);
        produto.setProfundidade(7.8);

        produto.imprimirInformacoes();

    }
}
