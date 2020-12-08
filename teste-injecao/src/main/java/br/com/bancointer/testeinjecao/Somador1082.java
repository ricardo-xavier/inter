package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1082")
public class Somador1082 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
