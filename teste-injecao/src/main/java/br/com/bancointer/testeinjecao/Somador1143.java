package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1143")
public class Somador1143 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
