package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1646")
public class Somador1646 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
