package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1028")
public class Somador1028 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
