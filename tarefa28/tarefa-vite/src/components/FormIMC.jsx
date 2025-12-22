import { useState } from 'react';


const FormIMC = () => {
    const [altura, setAltura] = useState('');
    const [peso, setPeso] = useState('');
    const [imc, setImc] = useState(null);
    const [classificacao, setClassificacao] = useState('');

    const calcularIMC = (e) => {
        e.preventDefault();

        const alturaNum = parseFloat(altura);
        const pesoNum = parseFloat(peso);

        const resultado = pesoNum / (alturaNum * alturaNum);
        setImc(resultado.toFixed(2));

        if (resultado < 18.5) {
            setClassificacao('Abaixo do peso');
        } else if (resultado < 25) {
            setClassificacao('Peso normal');
        } else if (resultado < 30) {
            setClassificacao('Sobrepeso');
        } else if (resultado < 35) {
            setClassificacao('Obesidade grau I');
        } else if (resultado < 40) {
            setClassificacao('Obesidade grau II');
        } else {
            setClassificacao('Obesidade grau III');
        }
    };

    return (
        <form className='form' onSubmit={calcularIMC}>
            <div>
                <label>Altura (m):</label>
                <input
                    type="number"
                    step="0.01"
                    value={altura}
                    onChange={e => setAltura(e.target.value)}
                    required
                />
            </div>

            <div>
                <label>Peso (kg):</label>
                <input
                    type="number"
                    value={peso}
                    onChange={e => setPeso(e.target.value)}
                    required
                />
            </div>

            <button type="submit">Calcular IMC</button>

            {imc && (
                <div className="resultado">
                    <p><b>IMC:</b> {imc}</p>
                    <p><b>Classificação:</b> {classificacao}</p>
                </div>
            )}
        </form>
    );
};

export default FormIMC;
