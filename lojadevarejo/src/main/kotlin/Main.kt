import java.util.Date
fun main(args: Array<String>){

}
    class LojaVarejo {
        var venderdor: Vendedor? = null
        var transportadora: Transportadora? = null
        var cliente: Cliente? = null
        var produto: Produto? = null
        var venda: Venda? = null
        var fornecedor: Fornecedor? = null


    }

    class Vendedor {
        var nomeVendedor: String? = null
        var cpfVendedor: String? = null
        var enderecoVendedor: String? = null
        var emailVendedor: String? = null
        var telefoneVendedor: String? = null
        var iD: String? = null
        var fornecedor: Fornecedor? = null
    }

    class Cliente {
        var nomeCliente: String? = null
        var cpfCliente: String? = null
        var celularCliente: String? = null
        var enderecoCliente: String? = null
        var emailCliente: String? = null
        var historicoCompras: String? = null
        var frequenciaDeCompra: String? = null
        var existeCadastrosNoSistema: Boolean? = null
    }

    class Produto {
        var codigoDeBarras: Int? = null
        var nomeProduto: String? = null
        var dataLancamento: Date? = null
        var valorProduto: String? = null
        var notaFiscal: String? = null
        var quantidadeEstoque: String? = null
    }

    class Transportadora {
        var nomeTransportadora: String? = null
        var endereco: String? = null
        var cnpj: String? = null
        var telefoneComercial: String? = null
        var emailTransportadora: String? = null
        var vendedor: Vendedor? = null
        var pontosDeDistribuicao: String? = null
        var horarioFuncionamento: String? = null
        var razaoSocial: String? = null
    }

    class Venda {
        var nomeVenda: String? = null
        var numeroVenda: String? = null
        var vendedor: Vendedor? = null
        var desconto: String? = null
        var lancamentoVenda: Date? = null
        var formaDePagamento: String? = null

    }

    class Fornecedor {
        var nomeFornecedor: String? = null
        var emailFornecedor: String? = null
        var telefoneFornecedor: String? = null
        var enderecoFornecedor: String? = null
        var razaoSocial: String? = null
    }

