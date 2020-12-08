package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1557")
public class Somador1557 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
