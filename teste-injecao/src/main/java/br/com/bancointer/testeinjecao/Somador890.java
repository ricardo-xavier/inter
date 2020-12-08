package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador890")
public class Somador890 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
