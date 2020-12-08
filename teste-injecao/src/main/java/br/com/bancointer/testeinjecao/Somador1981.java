package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1981")
public class Somador1981 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
