var string = "Alura";
var resultado = string.substring(1, 4);
                                lur


nome.substr(0, this.value.length);

var comparavel = nome.substr(0, this.value.length);
if (!(this.value == comparavel)) {
    paciente.classList.add("invisivel");
} else{
    paciente.classList.remove("invisivel");
}


//distinção entre maiusculo e minusculo
var comparavel = nome.substr(0, this.value.length);
var comparavelMinusculo = comparavel.toLowerCase();
var valorDigitadoMinusculo = this.value.toLowerCase();

if (!(valorDigitadoMinusculo == comparavelMinusculo)) {
    paciente.classList.add("invisivel");
} else{
    paciente.classList.remove("invisivel");
}